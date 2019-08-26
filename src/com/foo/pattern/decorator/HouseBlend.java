package com.foo.pattern.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        discription = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
