package com.foo.pattern.create.single;

public class Client {
    public static void main(String[] args) {
        Emperor qinShiHuang=Emperor.getInstance();
        System.out.println(qinShiHuang);
    }
}
