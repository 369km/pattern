package com.foo.pattern.behavior.visitor;

public class Client {
    public static void main(String[] args) {
        CommonEmployee zhangsan = new CommonEmployee();
        zhangsan.setName("张三");
        zhangsan.setSalary(10000);
        zhangsan.accept(new Visitor());
        Manager lisi = new Manager();
        lisi.setName("李四");
        lisi.setSalary(40000);
        lisi.accept(new Visitor());
    }
}
