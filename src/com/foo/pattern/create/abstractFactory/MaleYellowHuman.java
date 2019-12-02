package com.foo.pattern.create.abstractFactory;

public class MaleYellowHuman extends AbstractYellowHuman{
    @Override
    public void sex() {
        System.out.println("sex : male");
    }
}
