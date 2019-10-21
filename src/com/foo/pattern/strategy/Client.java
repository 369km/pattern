package com.foo.pattern.strategy;

public class Client {
    public static void main(String[] args) {
        Context context;
        context = new Context(new BackDoor());
        context.operate();
        context=new Context(new GivenGreentLight());
        context.operate();
        context=new Context(new BlockEnemy());
        context.operate();
    }
}
