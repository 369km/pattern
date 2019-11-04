package com.foo.pattern.builder;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMW Start");
    }

    @Override
    protected void stop() {
        System.out.println("BMW Stop");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW Alarm");
    }
}
