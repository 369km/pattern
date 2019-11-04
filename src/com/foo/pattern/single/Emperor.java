package com.foo.pattern.single;

public class Emperor {
    private static final Emperor emperor = new Emperor();

    private Emperor() {
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println(" I am emperor");
    }
}
