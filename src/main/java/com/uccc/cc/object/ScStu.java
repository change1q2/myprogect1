package com.uccc.cc.object;

import java.io.StringReader;

/**
 * 作者：seak
 * 内容：类的练习,类里面有（1.属性  2方法）
 * * 时间：2018/04/24 21:45
 */
public class ScStu {
    //定义属性field  也叫成员变量
    int id;
    String name;
    int age;
    Computer comp;//计算机


    //方法
    void  study(){
        System.out.println("学习"+comp.brand);
    }
   //构造方法,用于创建这个类的对象,无参的构造方法可以系统自己创建
    ScStu(){

    }
    void play(){
        System.out.println("娱乐");
    }
   //main 方法是程序的入口,必须要有
    public static void main(String[] args) {
        ScStu sty = new ScStu();//创建一个对象
        sty.id = 1001;
        sty.name = "海军";
        sty.age = 18;
        
        Computer c1 = new Computer();
        c1.brand ="联想";
        
        sty.comp = c1;
        sty.play();
        sty.study();


    }
    static class Computer{
        String brand;
    }
}
