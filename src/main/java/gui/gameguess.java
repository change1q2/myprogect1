package gui;

import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

/**
 * 作者：seak
 * 内容：猜拳游戏
 * 时间：2018/04/19 16:56
 */
class GameGuess {
    public static void main(String[] args) {
        System.out.println("- - -猜拳游戏- - - -");
        Scanner scanner;//Scanner 用于键盘输入
        scanner = new Scanner(System.in);
        System.out.println("请出拳：1.剪刀  2.石头  3.布");
        int a = scanner.nextInt();

        Random random = new Random();//生成随机数
        int b = random.nextInt(1) + 2;//括号里面的（1）+ 2规定生成随机数的范围

        String x = "剪刀";
        String y = "石头";
        String z = "布";
        if (a == 1 && b == 1) {
            System.out.print("你输入的是：" + x + "\t");
            System.out.println("电脑出的是：" + x + "\t");
            System.out.println("你们打平了！");
        }
        if (a == 1 && b == 2) {
            System.out.print("你输入的是：" + x + "\t");
            System.out.println("电脑出的是：" + y + "\t");
            System.out.println("你输了");
        }
        if (a == 1 && b == 3) {
            System.out.print("你输入的是：" + x + "\t");
            System.out.println("电脑出的是：" + z + "\t");
            System.out.println("你赢了");
        }
        if (a == 2 && b == 1) {
            System.out.print("你输入的是：" + y + "\t");
            System.out.println("电脑出的是：" + x + "\t");
            System.out.println("你赢了");
        }
        if (a == 2 && b == 2) {
            System.out.print("你输入的是：" + y + "\t");
            System.out.println("电脑出的是：" + y + "\t");
            System.out.println("你们打平了！");
        }
        if (a == 2 && b == 3) {
            System.out.print("你输入的是：" + y + "\t");
            System.out.println("电脑出的是：" + z + "\t");
            System.out.println("你输了");
        }
        if (a == 3 && b == 1) {
            System.out.print("你输入的是：" + z + "\t");
            System.out.println("电脑出的是：" + x + "\t");
            System.out.println("你输了");
        }
        if (a == 3 && b == 2) {
            System.out.print("你输入的是：" + z + "\t");
            System.out.println("电脑出的是：" + y + "\t");
            System.out.println("你赢了");
        }
        if (a == 3 && b == 3) {
            System.out.print("你输入的是：" + z + "\t");
            System.out.println(";电脑出的是：" + z + "\t");
            System.out.println("你们打平了！");
        }

        //处理判断
     /*   static {

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

        }*/


    }
}
