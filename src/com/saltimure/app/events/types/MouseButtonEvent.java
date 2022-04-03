package com.saltimure.app.events.types;

import com.saltimure.app.events.Event;
import com.saltimure.app.events.Event.Type;

public class MouseButtonEvent extends Event{

    private int x,y;
    private int button;

    protected MouseButtonEvent(int x, int y, int button, Type type) {
        super(type);
        this.x = x;
        this.y = y;
        this.button = button;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getButton() {
        return button;
    }

}
