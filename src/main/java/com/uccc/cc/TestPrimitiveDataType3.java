package com.uccc.cc;

public class TestPrimitiveDataType3 {
    public static void main(String[] args){
        char a = 'T';
        char b = '上';
        char c = '\u0061';// \u0061换行
        System.out.print(c);

        //转义字符
        System.out.println(""+'a'+'\n'+'b');//  \n  换行
        System.out.println(""+'a'+'\t'+'b');//  \t  制表符()
        //System.out.println(""+'a'+ "\"+"b';

        //String就是字符序列
        String d = "abc";

        //测试布尔序列
        boolean man = true;
        if(man){  //不推荐man == true这样的写法,代码能少则少
            System.out.println("男的");


        }

    }
}
