package com.foo.pattern.create.factory;

public class YellowHuman implements Human {
    @Override
    public void getSkinColour() {
        System.out.println("yellow colour :white");
    }

    @Override
    public void talk() {
        System.out.println("yellow type  human talk");
    }
}
