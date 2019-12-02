package com.foo.pattern.create.builder;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Benz Start");
    }

    @Override
    protected void stop() {
        System.out.println("Benz Stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz Alarm");
    }
}
