package com.foo.pattern.strategy;

public class RedHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i am redhead duck");
        fly();
        quack();
    }
}
