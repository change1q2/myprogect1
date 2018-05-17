package com.uccc.cc.数组;

/**
 * 作者：seak
 * 内容：测试数组初始化
 * 时间：2018/05/17 21:54
 */
public class Test02 {
    public static void main(String[] args) {
        int[] a ={2,4,55}; //静态数组初始化
       // Man[] mans ={new Man(1,1),new Man(2,2)};  //静态初始化引用类型数组

        User[] b ={
                    new User(1001,"搞起"),
                    new User(1002,"张三"),
                    new User(1003,"张三4"),
                    };

        //默认初始化
        int[] c = new int[3]; //默认给数组的元素进行赋值，赋值的规则和成员变量默认值规则一致。


        //动态初始化
        int[] a1 = new int[2];//动态初始化数组，先分配空间
        a1[0]=1;//给数组元素赋值;
        a1[1]=2;//给数组元素赋值


    }
}
