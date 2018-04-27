package com.uccc.cc.object;

/**
 * 作者:seak
 * 内容:
 * 时间:2018/04/27 19:05
 */
public class TestThis {
    int a,b,c;

    //构造器1
    TestThis(int a,int b){
        this.a = a;  //this指当前这个对象,就是class类里面int a.b ,c中的a
        this.b = b;
    }
    //构造器2
    TestThis(int a,int b,int c){
        this(a,b);//调用TestThis构造器1,必须放在第一位置
        this.c =c;
    }

    void sing(){
        System.out.println("海海");

    }
    void eat(){
        this.sing();//调用本类中的sing
        System.out.println("我爱你");
    }

    public static void main(String[] args) {
        TestThis hi = new TestThis(2,3);//构造一个hi方法,
        hi.eat();
    }
}
