package com.uccc.cc.Basics基础知识;

import java.util.Scanner;

/**
 * 作者:seak
 * 内容:石否能被2整除
 * 时间:2018/04/18 13:50
 */
import java.util.Scanner;
public class Testdouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c;
        System.out.println("请输入一个数:");
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("你输入的是偶数");

        }else{
            System.out.println("你输入的是奇数");
        }

    }
}
