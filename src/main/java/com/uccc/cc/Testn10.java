package com.uccc.cc;

/**
 * 作者：seak
 * 内容：计算10的阶乘 n!
 * * 时间：2018/04/23 21:02
 */
public class Testn10 {
     public static void main(String[] args){
        System.out.println(n1(10));;

    }
    static  long n1(int n){
        if(n == 1){//递归头
            return 1;
        }else {//递归体
            return n*n1(n-1);
        }

    }
}
