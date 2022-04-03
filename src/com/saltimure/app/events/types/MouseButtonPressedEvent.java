package com.saltimure.app.events.types;

public class MouseButtonPressedEvent extends MouseButtonEvent{

    protected MouseButtonPressedEvent(int x, int y, int button) {
        super(x, y, button, Type.MOUSE_PRESSED);
    }
   
}
