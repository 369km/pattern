package com.foo.pattern.abstractFactory;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getSkinColour() {
        System.out.println("skin colour :yellow");
    }

    @Override
    public void talk() {
        System.out.println("yellow type human talk");
    }
}
