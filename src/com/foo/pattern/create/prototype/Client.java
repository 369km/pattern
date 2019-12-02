package com.foo.pattern.create.prototype;

import java.util.Random;

/**
 * 使用原型模式时，引用的成员变量必须满足两个条件才不会被拷贝：<br/>
 * 一、类的成员变量，而不是方法内变量；<br/>
 * 二、必须是一个可变引用对象，而不是一个原始类型(int)或不可变对象(String)
 */
public class Client {
    private static int MAX_COUNT=6;

    public static void main(String[] args) {
        //normal
        for (int i=0;i<MAX_COUNT;i++){
            Mail mail = new Mail(new AdvTemplate());
            mail.setReceiver(getEmailAddress());
            sendEmail(mail);
        }

        //prototype
        Mail mail = new Mail(new AdvTemplate());
        for (int i=0;i<MAX_COUNT;i++){
            Mail clone = mail.clone();
            clone.setReceiver(getEmailAddress());
            sendEmail(clone);
        }
    }

    private static void sendEmail(Mail mail) {
        System.out.println("邮件已发送给："+mail.getReceiver()+" 邮件详情："+mail.getContent());
    }

    private static String getEmailAddress() {
        String source="qwertyuiopasdfghjklzxcvbnm";
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i=0;i<5;i++){
            builder.append(source.charAt(random.nextInt(source.length())));
        }
        builder.append("@qq.com");
        return builder.toString();
    }


}
