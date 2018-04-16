package com.uccc.cc;

/**
 * 作者:seak
 * 内容:if else使用
 * 时间:2018/04/16 13:55
 */
import java.util.Scanner;
public class Testifelse {
    public static void main(String[] args) {
        double r,r2;
        double C,S;
        //使用Scanner进行输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入半径:");
        r = scanner.nextDouble();
        //Math.pow(r,2)  Math.PI 求半径r的平方
        r2 = Math.pow(r,2);
        //计算圆的面积和周长
        C = 2*Math.PI*r;
        S = Math.PI*(r2);
        System.out.println("圆的周长是:"+C);
        System.out.println("圆的面积是:"+S);
        //判断周长和面积的大小
        if(C>=S){
            System.out.println("圆的周长大于或者等于面积");
        }else{
            System.out.println("圆的周长小于面积");
        }
    }

}
