package com.foo.pattern.struct.combination;

public class Employee {
    private String name;
    private Integer age;
    private String sex;

    public Employee(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
