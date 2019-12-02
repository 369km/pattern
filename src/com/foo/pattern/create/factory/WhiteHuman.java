package com.foo.pattern.create.factory;

public class WhiteHuman implements Human {
    @Override
    public void getSkinColour() {
        System.out.println("skin colour :white");
    }

    @Override
    public void talk() {
        System.out.println("white type human talk");
    }
}
