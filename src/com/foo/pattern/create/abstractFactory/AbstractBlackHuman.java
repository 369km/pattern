package com.foo.pattern.create.abstractFactory;

public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getSkinColour() {
        System.out.println("skin colour :black");
    }

    @Override
    public void talk() {
        System.out.println("black type human talk");
    }
}
