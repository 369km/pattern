package com.foo.pattern.struct.proxy;

public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
    System.out.println(this.name+" login success");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+ " is playing");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+ " upgrade");

    }
}
