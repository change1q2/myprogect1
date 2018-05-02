package com.uccc.cc.Basics基础知识;

public class TestPrimitiveDataType {
    public static void main(String[] args){
        //测试整型变量
        int a = 15;
        int b = 015;//以0开头的八进制
        int c = 0x15;//以0开头的16禁止
      //  int d = 0b1101;//以0开头的2禁止

        float a1 = 3.14F;
        double b1 = 6.28;
        double c1 = 628E-2;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       // System.out.println(d);
        System.out.println(a1);
        //浮点数不是精确的,一定不要用于比较
        float f =01f;
        double d = 1.0/10;
        System.out.println(f == d);//返回是false浮点型不要去比较
        //使用精确的浮点运行,使用BigDecimal

        byte age = 30;
        short salar = 30000;
        int population = 200000000;//整数常量默认
        long globalPopulation = 74000000000L;//加L表示这是一个Long这样的常量
    }
}
