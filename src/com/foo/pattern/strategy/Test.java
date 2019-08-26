package com.foo.pattern.strategy;

public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new Quack());
        duck.display();
    }
}
