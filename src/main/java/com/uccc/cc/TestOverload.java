package com.uccc.cc;

/**
 * 作者:seak
 * 内容:测试方法的重载
 * 时间:2018/04/23 11:44
 */
public class TestOverload {
    public static void main(String[] args) {
        System.out.println(add(3,5));//5
        System.out.println(add(3,5,10));//5
        System.out.println(add(3.0,5));//5
        System.out.println(add(3,5.0));//5


        //以及知道的方法重载
        System.out.println();//0个参数
        System.out.println(1);//参数是1个int
        //System.out.println(3,0);//参数是1个double
    }
    /**求和方法*/
    public static int add(int n1,int n2){
        int sum = n1 + n2;
        return sum;
    }
    //方法名相同,参数不同,构成重载
    public static int add(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        return sum;
    }

    public static double add(double n1, int n2){
        double sum = n1 + n2;
        return (double) sum;
    }

    public static double add(int n1, double n2){
        int sum = n1 + (int)n2;
        return sum;
    }

}
