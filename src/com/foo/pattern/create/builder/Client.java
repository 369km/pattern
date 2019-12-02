package com.foo.pattern.create.builder;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //normal
        BenzModel benz = new BenzModel();

        List<CarOptionType> sequence = new ArrayList<>(3);
        sequence.add(CarOptionType.START);
        sequence.add(CarOptionType.ALARM);
        sequence.add(CarOptionType.STOP);

        benz.setSequence(sequence);
        benz.run();

        //use builder
        BMWBuilder bmw = new BMWBuilder();
        List<CarOptionType> bmwSequence = new ArrayList<>(2);
        bmwSequence.add(CarOptionType.START);
        bmwSequence.add(CarOptionType.STOP);

        bmw.setSequence(bmwSequence);
        bmw.getCar().run();

        //use director
        Director director = new Director();
        director.getBenz().run();
    }
}
