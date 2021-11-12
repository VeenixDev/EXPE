package de.veenix.mmoengine.system;

import org.bukkit.event.Event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemHandler {

    /**
     * Define the ID under which the system is available
     *
     * @return The ID of the system
     */
    String systemId();

    Class<? extends Event> event();

}
