package com.foo.pattern.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //1
        IGamePlayer player = new GamePlayer("json");
        player.login("json", "123456");
        player.killBoss();
        player.upgrade();

        //2
        IGamePlayer json = new GamePlayer("json");
        IGamePlayer gamePlayer=new GamePlayerProxy(json);
        gamePlayer.login("json", "123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        //3
        IGamePlayer html = new GamePlayer("html");
        GamePlayIH gamePlayIH = new GamePlayIH(html);
        ClassLoader classLoader = html.getClass().getClassLoader();
        IGamePlayer o = (IGamePlayer)Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, gamePlayIH);
        o.login("html","123456");
        o.killBoss();
        o.upgrade();
    }

}
