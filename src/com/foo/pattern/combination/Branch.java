package com.foo.pattern.combination;

import java.util.ArrayList;
import java.util.List;

public class Branch implements IBranch {
    private List<ICorp> corpList = new ArrayList<>();
    private Employee employee;

    public Branch(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void addSubordinate(ICorp corp) {
        this.corpList.add(corp);
    }

    @Override
    public List<ICorp> getSubbordinate() {
        return this.corpList;
    }

    @Override
    public Employee getInfo() {
        return this.employee;
    }
}
