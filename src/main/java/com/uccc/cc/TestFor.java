package com.uccc.cc;

/**
 * 作者:seak
 * 内容:
 * 时间:2018/04/16 18:23
 */
public class TestFor {
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1;i<=100;i++){
            sum =sum + i;
        }
        /**
         * 1执行初始化语句 i=1
         * 2判断i<=100
         * 3执行循环体
         * 4步进迭代:i++
         * 5回到第二部继续判断
         */
        System.out.println(sum);
    }
   
}
