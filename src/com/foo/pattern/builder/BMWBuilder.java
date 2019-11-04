package com.foo.pattern.builder;

import java.util.List;

public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(List<CarOptionType> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCar() {
        return this.bmw;
    }
}
