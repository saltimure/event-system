package com.saltimure.app.events;

/**
 * @author saltimure
 * abstract class that contains event types declared in enum
 */
public abstract class Event {
    
    //event types
    public enum Type { 
        MOUSE_PRESSED,
        MOUSE_RELEASED,
        MOUSE_MOVED
    }
    
    private Type type;
    
    //only subclass can run this constructor
    protected Event (Type type) {
        this.type = type;
    }
}
