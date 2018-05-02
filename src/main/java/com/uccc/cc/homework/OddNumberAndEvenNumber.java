package com.uccc.cc.homework;

/**
 * 作者：seak
 * 内容：分别计算出100以内奇数和，偶数和
 * * 时间：2018/04/20 0:47
 */
public class OddNumberAndEvenNumber {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int sum2 = 0;
        while (i<=100){
            if(i%2 == 0){//偶数
                sum = sum + i;
            }else {//奇数
                sum2 = sum2 + i;
            }

            i++;
        }
        System.out.println("偶数和："+sum);
        System.out.println("奇数和："+sum2);

    }
}
