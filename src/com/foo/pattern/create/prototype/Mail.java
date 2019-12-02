package com.foo.pattern.create.prototype;

public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String content;

    public Mail(AdvTemplate advTemplate) {
        this.content = advTemplate.getAdvContent();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
