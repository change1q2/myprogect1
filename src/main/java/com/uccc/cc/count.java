package com.uccc.cc;

public class count {
    public static void main(String[] args){
        int a = 3;
        int b = 4;
        a+=b;//相当于a = a+b
        System.out.println(a);

        int c = 3;
        System.out.println(c == 3);
        System.out.println(a!=3);
        System.out.println(a<5);


        //char胡izidong自动转换数字,可以用来比较
        char d = 'a';
        char d2 = 'c';
        System.out.println("char***************************");
        System.out.println((int)d);//(int)强制转化,把d转换成int型
        System.out.println(0+d);
        System.out.println(d<d2);
    }


}
