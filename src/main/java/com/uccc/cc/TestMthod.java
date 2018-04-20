package com.uccc.cc;

/**
 * 作者:seak
 * 内容:测试方法的基本使用
 * 时间:2018/04/20 15:26
 */
public class TestMthod {
    public static void main(String[] args) {
        //通过对象调用普通方法
        TestMthod tm = new TestMthod();
        tm.printSxt();
        int c = tm.add(30,40,50)+1000;
        System.out.println(c);

    }
    void printSxt(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
    int add(int a,int b,int c){
        int sum = a+ b + c;
        System.out.println(sum);
        return sum;//return 两个作用:1结束方法的运行 2返回值
    }
}
