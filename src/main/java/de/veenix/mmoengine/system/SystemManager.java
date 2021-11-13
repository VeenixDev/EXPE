package de.veenix.mmoengine.system;

import lombok.Getter;
import org.bukkit.event.Event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

@Getter
public class SystemManager {

    @Getter
    public static final SystemManager instance = new SystemManager();

    // The String is the systemId
    private final HashMap<String, SystemInfo> systems = new HashMap<>();

    private SystemManager() { }

    /**
     * Adds a system to the manager to let the engine fully manage the system
     *
     * @param system The System(s) you want to add
     * @return {@code true} if the engine was able to add the system to the manager, or {@code false} if the system doesn't exist
     */
    public boolean addSystem(System system) {
        if(system == null) {
            return false;
        }

        Method[] methods = system.getClass().getDeclaredMethods();

        for(Method method : methods) {
            if(method.isAnnotationPresent(SystemHandler.class)) {
                SystemHandler sysHandler = method.getAnnotation(SystemHandler.class);
                String systemId = sysHandler.systemId();

                if(systems.containsKey(sysHandler.systemId())) {
                    systems.get(systemId).addMethod(method);
                } else {
                    ArrayList<Method> methodsArray = new ArrayList<>();
                    methodsArray.add(method);

                    SystemInfo sysInfo = new SystemInfo(system.getClass(), methodsArray);

                    systems.put(systemId, sysInfo);
                }
            }
        }
        return true;
    }

    /**
     * Triggers a method defined for the system with the event it was triggered from
     *
     * NOTE: It's not recommended calling these functions by yourself, instead let the engine handle this
     *
     * @param systemId The id of the system
     * @param event The Event that happened
     * @param eventClass The class of the event to later cast it to the correct event
     * @return {@code true} if everything ran through without an error and the system does exist, or {@code false} if the system doesn't exist or an error happened
     */
    public boolean triggerSystem(String systemId, Event event, Class<? extends Event> eventClass) {
        if(!this.systems.containsKey(systemId)) {
            return false;
        }

        boolean error = false;

        for(Method method : this.systems.get(systemId).getMethods()) {
            SystemInfo info = systems.get(systemId);
            try {
                if(method.getParameterTypes()[0].equals(eventClass)) {
                    method.invoke(info.getSystemClass(), eventClass.cast(event));
                }
            } catch (InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
                error = true;
            }
        }

        // For better readability
        return !error;
    }

    /**
     * Triggers every system's methods
     *
     * NOTE: It's not recommended calling these functions by yourself, instead let the engine handle this
     *
     * @param event The event that happened
     * @param eventClass The class of the event to later cast it to the correct event
     * @return {@code true} if every method ran through successfully, or {@code false} if a method didn't run problem free. For more information see triggerSystem
     *
     * @see SystemManager#triggerSystem(String, Event, Class)
     */
    public boolean triggerSystem(Event event, Class<? extends Event> eventClass) {
        AtomicBoolean success = new AtomicBoolean(true);
        getSystems().forEach(id -> {
            if(!triggerSystem(id, event, eventClass)) {
                success.set(false);
            }
        });
        return success.get();
    }

    public Set<String> getSystems() {
        return this.systems.keySet();
    }
}
