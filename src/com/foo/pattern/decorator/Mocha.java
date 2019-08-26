package com.foo.pattern.decorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDiscription() {
        return beverage.getDiscription() + ", mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
