package com.foo.pattern.behavior.strategy;

public class GivenGreentLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行");
    }
}
