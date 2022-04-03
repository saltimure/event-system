package com.saltimure.app.events.types;

public class MouseButtonReleased extends MouseButtonEvent{

    protected MouseButtonReleased(int x, int y, int button) {
        super(x, y, button, Type.MOUSE_RELEASED);
    }

}
