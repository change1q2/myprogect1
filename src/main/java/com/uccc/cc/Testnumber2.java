package com.uccc.cc;

/**
 * 作者:seak
 * 内容:判断是否输入的是数字
 * 时间:2018/04/18 17:29
 */
import java.util.Scanner;

public class Testnumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = scanner.next();
           while (true) {
            try {
                i = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("输入的" + s + "不是数字,重新输入:");
                s = scanner.next();

            }
        }
    }
}
