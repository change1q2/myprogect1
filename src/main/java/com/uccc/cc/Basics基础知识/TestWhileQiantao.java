package com.uccc.cc.Basics基础知识;

/**
 * 作者:seak
 * 内容:测试潜逃循环
 * 时间:2018/04/18 10:27
 */
public class TestWhileQiantao {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
            System.out.print(i + "\t");
            }
            System.out.println(i);
        }
    }
}
