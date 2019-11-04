package com.foo.pattern.abstractFactory;

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
