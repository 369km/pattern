package com.foo.pattern.builder;

import java.util.List;

public class BenzBuilder extends CarBuilder {
    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(List<CarOptionType> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCar() {
        return this.benz;
    }
}
