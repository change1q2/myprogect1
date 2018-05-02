package com.uccc.cc.homework;

/**
 * 作者:seak
 * 内容:测试100-150之间不能被3整除的数并且每行打印5个用continue语句
 * 时间:2018/04/20 10:33
 */
public class Test100And150Divide3 {
    public static void main(String[] args) {
        int total =0;
        for(int i=100;i<=150;i++){

            if(i%3 == 0){
                continue;
            }else{
                System.out.print(i +"\t");
            }
            total++;
            if(total%5 == 0){
                System.out.println();
                //total =0;
            }
        }

    }
}
