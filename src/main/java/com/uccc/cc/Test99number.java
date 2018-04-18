package com.uccc.cc;

/**
 * 作者:seak
 * 内容:制作99乘法表
 * 时间:2018/04/18 11:22
 */
public class Test99number {
    public static void main(String[] args) {
        int number;
        for(int i =1;i<=9;i++){

            for(int j =1;j<i;j++){
                System.out.print(j + "*" + i + "=" +(i * j)+"\t");
                //j一个乘数 +字符串连接符 "*"打印的内容
            }
            System.out.println();
        }
    }
}
