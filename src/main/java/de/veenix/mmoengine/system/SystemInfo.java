package de.veenix.mmoengine.system;

import lombok.Getter;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Getter
public class SystemInfo {

    private final ArrayList<Method> methods = new ArrayList<>();
    private final Class<? extends System> systemClass;

    public SystemInfo(Class<? extends System> systemClass, List<Method> methods) {
        this.systemClass = systemClass;
        this.methods.addAll(methods);
    }

    public boolean addMethod(Method method) {
        return this.methods.add(method);
    }

    public boolean removeMethod(Method method) {
        return this.methods.remove(method);
    }
}
