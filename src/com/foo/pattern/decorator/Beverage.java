package com.foo.pattern.decorator;

public abstract class Beverage {
    protected String discription = "beverage";

    public String getDiscription() {
        return discription;
    }

    public abstract double cost();
}
