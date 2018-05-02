package com.uccc.cc.Basics基础知识;
/**
 * 测试敞亮
 * 作者:海军
 */
public class testConstant {
    public static void main(String[] args){
        int age = 18;
        final String name = "haijun"; //final修饰的叫做符号常量
     //   name = "海军";//加入final以后name就不可以变了
        final double PI = 3.14;//PI=3.15编译错误,不能再赋值
        double r= 4;
        double area = PI*r*r;
        double circle = 2*PI*r;
        System.out.println("area = "+ area);
        System.out.println("circle ="+ circle);
    }
}
