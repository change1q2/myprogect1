package com.uccc.cc.Basics基础知识;

/**
 * 测试变量
 * 作者:海军
 */
public class TestVariable {
    int a;//成员变量,从属于对象,成员变量会自动被初始化,成员变量服务于对象
    static int size;//静态变量,从属于类, (size从属于static)
    public static void main(String[] args){

        {
            int a =5;//局部变量,从属于语句块,在{}里面的叫做局部变量,只影响{}里面的内容,不管{}外面的内容
        }
        int age;
        age = 18;
        int salary = 3000;//局部变量,从属于方法
        int gao = 13;
        /*变量申明后一定要进行初始化*/
        System.out.print(gao);

    }
}
