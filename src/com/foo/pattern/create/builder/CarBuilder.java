package com.foo.pattern.create.builder;

import java.util.List;

public abstract class CarBuilder {
    public abstract void setSequence(List<CarOptionType> sequence);

    public abstract CarModel getCar();
}
