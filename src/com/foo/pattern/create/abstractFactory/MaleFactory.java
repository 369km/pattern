package com.foo.pattern.create.abstractFactory;

public class MaleFactory implements HumanFactory {
    @Override
    public Human CreateYellowHuman() {
        return new MaleYellowHuman();
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
