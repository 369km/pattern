package com.foo.pattern.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        discription = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
