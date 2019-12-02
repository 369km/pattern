package com.foo.pattern.behavior.observer;

public class Client {
    public static void main(String[] args) {
        Observer lisi=new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(lisi);
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
