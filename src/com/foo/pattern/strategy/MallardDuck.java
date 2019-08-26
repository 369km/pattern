package com.foo.pattern.strategy;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i am mallard duck");
        fly();
        quack();
    }
}
