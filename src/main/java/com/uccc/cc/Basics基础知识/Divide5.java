package com.uccc.cc.Basics基础知识;

/**
 * 作者：seak
 * 内容：输出1-1000能被5整出的树并且每行显示5个
 * * 时间：2018/04/20 1:10
 */
public class Divide5 {
    public static void main(String[] args) {
        int sum = 0;
        int h = 0;//加一个计数器的变量可以实现控制计数换行
        for(int i = 1; i <= 1000 ;i++){
            if(i%5 == 0){
                System.out.print(+i +"\t");
                h++;
            }
            //对h进行判断 到5个数了进行一次计算并且将h至0
            if (h == 5){
                System.out.println();
                h = 0;
            }


        }
    }
}
