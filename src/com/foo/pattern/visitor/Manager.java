package com.foo.pattern.visitor;

public class Manager extends Employee {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
