package com.foo.pattern.visitor;

public class CommonEmployee extends Employee {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
