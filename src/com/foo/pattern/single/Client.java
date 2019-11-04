package com.foo.pattern.single;

public class Client {
    public static void main(String[] args) {
        Emperor qinShiHuang=Emperor.getInstance();
        System.out.println(qinShiHuang);
    }
}
