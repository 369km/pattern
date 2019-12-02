package com.foo.pattern.struct.facade;

public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("五年机会把握","火星");
    }
}
