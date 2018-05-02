package com.uccc.cc.Basics基础知识;

/**
 * 作者:seak
 * 内容:
 * 时间:2018/04/16 15:50
 */
public class Testswitch {
    public static void main(String[] args) {
        int month =(int)(12* Math.random())+1;
        switch(month){
            case 1:
                System.out.println("一月大");
                break;
            case 2:
                System.out.println("二月平");
                break;
             case 3:
                 System.out.println("三月去");
                 break;
            default:
                System.out.println("其他月份");
                break;

        }
    }
}
