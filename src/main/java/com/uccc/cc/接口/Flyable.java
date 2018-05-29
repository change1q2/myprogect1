package com.uccc.cc.接口;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

/**
 * 作者：seak
 * 内容：接口是个多继承
 * 时间：2018/05/28 8:41
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public interface Flyable {
    int MAX_SPEED = 11000;
    int MIN_HEIGHT = 1;
    void fly();
}
 interface Attack {
    void attack();
}

//定义实现接口，可以实现多个接口
class Plane implements Flyable{
    @Override
    public void fly(){
        System.out.println("飞机飞");
    }
}

class Man implements Flyable{
    @Override
    public void fly(){
        System.out.println("跳着飞");
    }
}

class Stone implements Flyable,Attack{
    @Override
    public void fly(){
        System.out.println("石头飞");
    }

    @Override
    public void attack() {
        System.out.println("打中啦");
    }
}
