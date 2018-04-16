package com.uccc.cc;

/**
 * 作者:seak
 * 内容:if else  if else 多从筛选
 * 时间:2018/04/16 15:05
 */
public class Testifelseif {
    public static void main(String[] args) {
        int age = (int)(100*Math.random());
        System.out.println("随机产生的年龄是:"+age);
        if(age<15){
            System.out.println("儿童");
        }else if(age<25){//这里的age小于25相当于分开来的15<=age<=25
            System.out.println("少年");
        }else if(age<35){
            System.err.println("小伙子");
        }else if(age<45){
            System.out.println("中年");
        }else if(age<55){
            System.out.println("退休了");
        }else if(age>85){
            System.out.println("这辈子快到头啦");
        }else{
            System.out.println("该结束人生喽");
        }
    }

}
