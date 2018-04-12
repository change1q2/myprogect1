package com.uccc.cc;

public class TestOperator03 {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        System.out.println(a&b);//逻辑与2个操作数为true才返回true
        System.out.println(a|b);//逻辑或 有一个true就返回true
        System.out.println(a^b);//逻辑异或 相同为false,不同为true
        System.out.println(!b);//逻辑非,取反

        //测试短路
        //int c = 3/0;
       /* boolean c = 1>2&2<(3/0);
        System.out.println(c);*/

        boolean d = 1>2&&2<(3/0);  //使用短路与(&&)只要一个为false直接返回false不进行后面的运算
        System.out.println(d);

        int  w =3;
        int  g =4 ;
        System.out.println(w&g);
        System.out.println(w|g);
        System.out.println(w^g);
        System.out.println(~w);

        //以为运算
        int c1 = 3<<2;
        System.out.println(c1);
        System.out.println(12>>1);


    }
}
