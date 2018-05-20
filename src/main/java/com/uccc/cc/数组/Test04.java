package com.uccc.cc.数组;

/**
 * 作者：seak
 * 内容：测试数组，foreach 的练习和使用
 * 时间：2018/05/18 20:29
 */
public class Test04 {
    public static void main(String[] args) {
        int[] a = new int[4];//给数组分配一个空间，长都定位4


        //初始化数组的元素值
        for(int i=0;i<a.length;i++){
            a[i] = 100*i;
        }
        //读取元素的值
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++");

        //foreach 读取元素的值,不能修改元素的值
        //循环遍历a里面的内容
        for(int m:a){
            System.out.println(m);

        }

        //循环遍历ss里面的内容
        String[] ss = {"aa","bbb","ccc","ddd"};
        for(String temp:ss){
            System.out.println(temp);
        }
    }
}
