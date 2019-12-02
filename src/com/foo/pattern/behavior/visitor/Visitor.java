package com.foo.pattern.behavior.visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(Employee employee) {
        System.out.println(new StringBuilder("姓名：").append(employee.getName()).append("\n")
                .append("薪水：").append(employee.getSalary()));
    }
}
