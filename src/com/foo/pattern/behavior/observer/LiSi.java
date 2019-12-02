package com.foo.pattern.behavior.observer;

public class LiSi implements Observer {
    @Override
    public void update(String context) {
        reportToQinShiHuang(context);
    }

    private void reportToQinShiHuang(String context) {
        System.out.println("李斯：启奏皇帝，" + context);
    }
}
