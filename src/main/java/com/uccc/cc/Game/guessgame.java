package com.uccc.cc.Game;

/**
 * 作者:seak
 * 内容:猜数游戏1 投骰子🎲
 * 时间:2018/04/16 11:12
 */
public class guessgame {
    public static void main(String[] args) {
        int i = (int)(6*Math.random())+1;
        int j = (int)(6*Math.random())+1;
        int k = (int)(6*Math.random())+1;
        int count = i+ j+ k;

        System.out.println(count);
        if (count>=16){
            System.out.println("手气非常好");
        }
        if(count>=6&&count<=15){
            System.out.println("还行");
        }
        if (count<6)
        {
            System.out.println("预期差了点");
        }

    }
}
