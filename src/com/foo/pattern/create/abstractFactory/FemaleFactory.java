package com.foo.pattern.create.abstractFactory;

public class FemaleFactory implements HumanFactory {
    @Override
    public Human CreateYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human CreateWhiteHuman() {
        return null;
    }

    @Override
    public Human CreateBlackHuman() {
        return null;
    }
}
