package com.foo.pattern.create.prototype;

import java.util.Random;

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
