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

    void  study(){
        System.out.println("学习");
    }

    void play(){
        System.out.println("娱乐");
    }
   //main 方法是程序的入口不许要哟哟
    public static void main(String[] args) {
        ScStu sty = new ScStu();
        sty.play();
        sty.study();

    }
}
