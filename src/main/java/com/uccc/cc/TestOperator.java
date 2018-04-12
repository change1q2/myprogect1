package com.uccc.cc;

public class TestOperator {
    public static void main(String[] args){
        byte a = 1;
        int b =2;
        long b2 = 3;
        //byte c = a+ b;   //报错有int  肯定是按int除非有long
        //int c2 = b2+b;   //报错 long  不能放在int里面计算

        float f1 = 3.14F;
        float d = b +b2;
        //float de = f1 +6.2;  //6.2是double 不能跟float一起运算

        //取摸的运算
        System.out.println(-9%5);

        //测试自曾自减
        int a4 =3;
        int b4 = ++ a4;
        int b5 = a ++;
        System.out.println("a4 = "+a4+"\nb4="+b4);
        a4 = 3;
        b4 = ++a4;//执行完后,a自增,再给c符值
        System.out.println("a="+a+"\nc="+b);


    }
}
