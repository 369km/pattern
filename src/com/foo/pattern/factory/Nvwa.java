package com.foo.pattern.factory;

public class Nvwa {
    public static void main(String[] args) {
        AbstractHumanFactory gold=new HumanFactory();

        WhiteHuman whiteHuman = gold.createHuman(WhiteHuman.class);
        whiteHuman.getSkinColour();
        whiteHuman.talk();

        BlackHuman blackHuman = gold.createHuman(BlackHuman.class);
        blackHuman.getSkinColour();
        blackHuman.talk();

        YellowHuman yellowHuman = gold.createHuman(YellowHuman.class);
        yellowHuman.getSkinColour();
        yellowHuman.talk();
    }
}
