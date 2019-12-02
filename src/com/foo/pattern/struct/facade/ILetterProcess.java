package com.foo.pattern.struct.facade;

public interface ILetterProcess {
    void writeContext(String context);
    void fillEnvellope(String address);
    void letterIntoEnvollope();
    void sendLetter();
}
