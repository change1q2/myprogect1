package com.uccc.cc;

/**
 * 作者:seak
 * 内容:
 * 时间:2018/04/16 11:42
 */
import java.util.Scanner;
public class guessgame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个1--100的数字:");
        int number;
        number = scanner.nextInt();
        System.out.println("请再输入来一次:");
        number = scanner.nextInt();
        System.out.println("请再输入来一次:");
        number = scanner.nextInt();
        if(number<50){
            System.out.println("小了");
        }else{
            System.out.println("大了");
        }
       /* System.out.println("请再输入来一次:");
        number = scanner.nextInt();
        if(number<50){
            System.out.println("小了");
        }else{
            System.out.println("大了");
        }
        System.out.println("请最后一次:");
        number = scanner.nextInt();
        if(number == 55){
            System.out.println("恭喜你答对了");

        }else {
            System.out.println("很遗憾游戏结束");
        }*/

    }
}
