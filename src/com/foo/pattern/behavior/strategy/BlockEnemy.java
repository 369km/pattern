package com.foo.pattern.behavior.strategy;

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙小妹断后，挡住追兵");
    }
}
