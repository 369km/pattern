package com.foo.pattern.struct.combination;

public class Leaf implements ILeaf {
    private Employee employee;

    public Leaf(Employee employee) {
        this.employee = employee;
    }

    @Override
    public Employee getInfo() {
        return employee;
    }
}
