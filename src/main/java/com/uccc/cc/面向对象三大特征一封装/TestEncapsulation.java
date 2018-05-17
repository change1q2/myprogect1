package com.uccc.cc.面向对象三大特征一封装;

/**
 * 作者：seak
 * 内容：测试封装
 * * 时间：2018/05/09 22:36
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        h.age = 12;//age没有被封装所以算是public类可以在任何地方调用
        //  h.sexage =13;//sexage 被封装了所以不能调用
    }
}

//定义一个新的class类，并定义一个新的方法void
class Human{
    int age;
    private int sexage; //用private 封装sexage，这样他就是私有的只能Human类里面用，其他地方无法调用
    void sayGood(){
        System.out.println(age);
        System.out.println(sexage);
    }
        }

        //就算继承了也不能使用，但是子类里面有private属性
class  Boy extends Human{
    void sayHello(){
        System.out.println(age);
        //System.out.println(sexage);//用private 封装sexage，这样他就是私有的只能Human类里面用，其他地方无
    }
}
