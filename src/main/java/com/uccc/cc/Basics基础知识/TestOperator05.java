package com.uccc.cc.Basics基础知识;

/**
 * 字符串运算符
 * 作者:海军
 */
public class TestOperator05 {
    public static void main(String[] args){
        String a = "3";//定义一个字符串常量3
        int b =4;
        int c =5;
        char d ='a';//定义一个字符d
        System.out.println(a+b+c);//字符串连接符a+b+c(345) +会变长连接符连接abc,因为ishouxian运算的a连接符
        System.out.println(b+c+a);//b+c+a(93)bc都是数字先进运算,再计算a是字符串+作为连接符连接3
        System.out.println(d+4);//a再assl里面是97   97+4=101




    }
}
