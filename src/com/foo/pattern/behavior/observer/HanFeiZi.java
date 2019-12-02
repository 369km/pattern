package com.foo.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class HanFeiZi implements Observable , IAction {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        observerList.forEach(observer -> observer.update(context));
    }

    @Override
    public void haveBreakfast() {
        notifyObservers("韩非子：吃了鲍鱼");
    }

    @Override
    public void haveFun() {
        notifyObservers("韩非子：打猎了");
    }
}
