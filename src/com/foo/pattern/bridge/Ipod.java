package com.foo.pattern.bridge;

public class Ipod extends Product {
    @Override
    public void beProducted() {
        System.out.println("product ipod ...");
    }

    @Override
    public void beSelled() {
        System.out.println("sell ipod ...");
    }
}
