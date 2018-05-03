package com.uccc.cc.面向对象三大特征一一继承;

/**
 * 作者:seak
 * 内容:测试继承
 * 时间:2018/05/03 19:33
 */
public class TextExtend {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "hi阿海";
        stu.height = 172;
        stu.rest();

        Boy boy1 = new Boy("茜茜",6,"挖掘机");



    }
}

class Person {
    String name;
    int height;

    public void rest() {
        System.out.println("休息一会");
    }

}


class Student{
    String name;
    int height;
    String major;

    public void rest() {
        System.out.println("休息一会");
    }
}
//使用了继承关键字extend就可以继承Person里面所有的内容就不用繁琐的打 name height等内容
class Boy extends Person{
    String major;
    public void study(){
        System.out.println();
    }
    public Boy(String name, int height, String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }

}