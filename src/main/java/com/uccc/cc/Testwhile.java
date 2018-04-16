package com.uccc.cc;

/**
 * 作者:seak
 * 内容:hile循环
 * 时间:2018/04/16 18:10
 */
public class Testwhile {
    public static void main(String[] args) {
        //计算1+2+3...+100累加的和
        int i =0;
        int sum = 0;
        while(i<=100){
            sum = sum +i;
            i++;//i = i(0)+1  ,i=1
        }
        System.out.println(sum);
    }
}
