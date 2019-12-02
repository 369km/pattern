package com.foo.pattern.create.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
    private List<CarOptionType> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    final public void setSequence(List<CarOptionType> sequence) {
        this.sequence = sequence;
    }

    final public void run() {
        sequence.forEach(s -> {
            if (s.equals(CarOptionType.START)) {
                this.start();
            }
            if (s.equals(CarOptionType.STOP)) {
                this.stop();
            }
            if (s.equals(CarOptionType.ALARM)) {
                this.alarm();
            }
        });
    }
}
