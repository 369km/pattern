package com.foo.pattern.bridge;

public class Client {
    public static void main(String[] args) {
        new HouseCorp(new House()).makeMoney();
        new IpodCorp(new Ipod()).makeMoney();
    }
}
