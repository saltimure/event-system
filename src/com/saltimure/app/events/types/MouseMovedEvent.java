package com.saltimure.app.events.types;

import com.saltimure.app.events.Event;

/**
 * @author saltimure
 * MouseMovedEvent represents MOUSE_MOVED type event
 */
public class MouseMovedEvent extends Event{
    
    private int x;
    private int y;
    private boolean dragged;
    
    protected MouseMovedEvent(int x, int y, boolean dragged) {
        super(Type.MOUSE_MOVED);
        this.x = x;
        this.y = y;
        this.dragged = dragged;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isDragged() {
        return dragged;
    }
}
