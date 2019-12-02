package com.foo.pattern.create.abstractFactory;

public interface HumanFactory {
    Human CreateYellowHuman();

    Human CreateWhiteHuman();

    Human CreateBlackHuman();
}
