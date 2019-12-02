package com.foo.pattern.create.abstractFactory;

public class Client {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();
        Human maleYellowHuman = maleHumanFactory.CreateYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.CreateYellowHuman();

        femaleYellowHuman.talk();
        femaleYellowHuman.getSkinColour();
        femaleYellowHuman.sex();

        maleYellowHuman.talk();
        maleYellowHuman.getSkinColour();
        maleYellowHuman.sex();
    }
}
