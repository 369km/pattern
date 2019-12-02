package com.foo.pattern.create.factory;

public class BlackHuman implements Human {
    @Override
    public void getSkinColour() {
        System.out.println("black colour :white");
    }

    @Override
    public void talk() {
        System.out.println("black type human talk");
    }
}
