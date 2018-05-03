package com.uccc.cc.面向对象三大特征一一继承;

/**
 * 作者:seak
 * 内容:测试重写(override),也就是覆盖
 * 时间:2018/05/03 20:06
 */

//程序的入口
public class TestoVERRIDE {
    public static void main(String[] args) {
        Horse h = new Horse();
        Vehicle v = new Vehicle();
        h.run();
        h.stop();

    }

}

//创建一个class类,加入run 和stop方法
 class Vehicle{
    public void run(){
        System.out.println("跑");
    }

    public void stop(){
        System.out.println("停止!");
    }
 }

 //重写Vehicle,就算是继承了Vehicle里面run的类容也可以进行方法重写
 class Horse extends Vehicle{
    public void run(){
        System.out.println("dddd");
    }

 }