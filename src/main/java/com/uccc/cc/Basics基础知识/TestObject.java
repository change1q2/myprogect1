package com.uccc.cc.Basics基础知识;

/**
 * 作者：seak
 * 内容：测试Object
 * * 时间：2018/05/05 21:04
 */
public class TestObject {

    public static void main(String[] args) {
        TestObject obj = new TestObject();
        System.out.println(obj.toString());

//        Person2 p2 =new Person2("西西",6);
//        System.out.println(p2.toString());
    }
    //方法的重写重写了obj
    public String toString(){
        return "测试对象";
    }

    class Person2{
        String name;
        int age;
    }

 /*   @Override//注解表示重写
    public String toString(){
        return name+",年龄:"+age;
    }
    public Person2(String name,int age){
        this.name = name;
        this.age = age;*/
    }




