package com.foo.pattern.abstractFactory;

public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void sex() {
        System.out.println("sex : male");
    }
}
