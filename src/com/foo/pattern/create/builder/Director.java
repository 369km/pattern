package com.foo.pattern.create.builder;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private List<CarOptionType> sequence = new ArrayList<>(3);
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getBenz() {
        this.sequence.clear();
        this.sequence.add(CarOptionType.START);
        this.sequence.add(CarOptionType.ALARM);
        this.sequence.add(CarOptionType.STOP);
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCar();
    }

    public BMWModel getBMW() {
        this.sequence.clear();
        this.sequence.add(CarOptionType.START);
        this.sequence.add(CarOptionType.STOP);
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.benzBuilder.getCar();
    }

}
