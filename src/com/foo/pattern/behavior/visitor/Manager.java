package com.foo.pattern.behavior.visitor;

public class Manager extends Employee {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
