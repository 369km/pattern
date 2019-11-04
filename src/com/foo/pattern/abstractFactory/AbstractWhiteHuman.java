package com.foo.pattern.abstractFactory;

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getSkinColour() {
        System.out.println("skin colour :white");
    }

    @Override
    public void talk() {
        System.out.println("white type human talk");
    }
}
