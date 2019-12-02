package com.foo.pattern.behavior.template;

public class HummerH2Model extends HummerModel {
    @Override
    void start() {
        System.out.println("hummer h2 start");
    }

    @Override
    void alarm() {
        System.out.println("hummer h2 alarm");
    }

    @Override
    void stop() {
        System.out.println("hummer h2 stop");
    }

    @Override
    void run() {
        this.start();
        this.alarm();
        this.stop();
    }
}
