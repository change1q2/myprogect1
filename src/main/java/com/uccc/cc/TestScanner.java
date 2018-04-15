package com.uccc.cc;

/**
 * 作者：seak
 * 内容：Scanner获取键盘输入
 * 时间：2018/04/15 9:30
 */
import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入名字：");
        String name = scanner.nextLine();
        System.out.println("输入你的爱好：");
        String favor = scanner.nextLine();
        System.out.println("输入你的年龄：");
        int age = scanner.nextInt();


        System.out.println("######################");
        System.out.println(name);
        System.out.println(favor);
        System.out.println(age);
        System.out.println("来到地球天数："+age*365);
        System.out.println("离开地球天书："+(72-age)*365);
    }
}
