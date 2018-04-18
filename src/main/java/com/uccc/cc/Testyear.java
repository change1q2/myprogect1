package com.uccc.cc;

/**
 * 作者:seak
 * 内容:
 * 时间:2018/04/18 14:02
 */
/*
待决绝问题:如果2次输入的不一致怎么做?
*/

/*
若整数a除以非零整数b，商为整数，且余数 [1]  为零，
我们就说a能被b整除（或说b能整除a），
a为被除数，b为除数，即b丨a（“丨”是整除符号），
读作“b整除a”或“a能被b整除”。a叫做b的倍数，b叫做a的约数（或因数）。整除属于除尽的一种特殊情
*/
//如何判断你输入的是不是数字


import java.util.Scanner;

public class Testyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("确认你输入的年份是:");
        int year = scanner.nextInt();
        if(year==0){
            System.out.println("你输入的有误");
        }else if ( 4%year==0 && 100%year!=0 && 400%year ==0){
            System.out.println("你输入的是瑞年");
        }else {
            System.out.println("你输入的不是瑞年");
        }

    }

    static {

            Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份:");
            String s = scanner.next();
            while (true) {
                try {
                    int year = Integer.parseInt(s);
                    break;
                } catch (Exception e) {
                    System.out.println("输入的" + s + "不是数字,重新输入:");
                    s = scanner.next();

                }
            }

    }


}


