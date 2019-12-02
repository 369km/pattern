package com.foo.pattern.struct.facade;

public class ModenPostOffice {
    private ILetterProcess letterProcess=new LetterProcessImpl();
    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvellope(address);
        letterProcess.letterIntoEnvollope();
        letterProcess.sendLetter();
    }
}
