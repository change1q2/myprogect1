package com.uccc.cc.面向对象三大特征一封装;

/**
 * 作者：seak
 * 内容：封装测试的运用，要小气点都用private私用就对了
 * 时间：2018/05/15 8:35
 */
//把所有属性都私有化，就只有这个类可以使用了
public class Person4 {
    private int id;
    private String name;
    private int age;
    private boolean man;

    /*一、this关键字主要有三个应用：
            (1)this调用本类中的属性，也就是类中的成员变量；
            (2)this调用本类中的其他方法；
            (3)this调用本类中的其他构造方法，调用时要放在构造方法的首行。
    Public Class Student {
        String name; //定义一个成员变量name
        private void SetName(String name) { //定义一个参数(局部变量)name
            this.name=name; //将局部变量的值传递给成员变量
        }
    }*/
    //定义一个setName方法，使用this关键字给name，将局部变量(String name)的值传递给成员变量 private String name;
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //在方法中还可以进行判断
    public void setAge(int age) {
        if(age >=1 && age<=130){
            this.age = age;
        }else {
            System.out.println("请输入正常年龄");
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }
}
