package com.foo.pattern.template;

public class HummerH1Model extends HummerModel {
    @Override
    void start() {
        System.out.println("hummer h1 start");
    }

    @Override
    void alarm() {
        System.out.println("hummer h1 alarm");
    }

    @Override
    void stop() {
        System.out.println("hummer h1 stop");
    }

    @Override
    void run() {
        this.start();
        this.alarm();
        this.stop();
    }
}
