package com.uccc.cc;

import java.util.Random;

/**
 * 作者:seak
 * 内容:测试 Break
 * 时间:2018/04/20 10:04
 */
public class TestBreak {
    public static void main(String[] args) {
    int total = 0;//定义计数器
       // System.out.println("北京'");
        while(true){
            total++;//每次循环计数器+1
            //产生0-100的随机数
            int i =(int)Math.round(100*Math.random());
            //随机到88就结束循环
            if(i == 88){
                break;
            }
        }
        System.out.println("完成:"+total +"\t" +"times"+"\t");

    }
}
