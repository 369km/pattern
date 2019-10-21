package com.foo.pattern.Facade;

public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("写信："+context);
    }

    @Override
    public void fillEnvellope(String address) {
        System.out.println("填写信封："+address);
    }

    @Override
    public void letterIntoEnvollope() {
        System.out.println("装好信件");
    }

    @Override
    public void sendLetter() {
        System.out.println("发送信件");
    }
}
