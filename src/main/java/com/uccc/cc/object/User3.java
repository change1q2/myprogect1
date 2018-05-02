package com.uccc.cc.object; //包域名倒着写

/**
 * 作者：seak
 * 内容：static静态块
 * 时间：2018/05/02 7:12
 */
//建立一个类叫User3
public class User3 {
    int id;//普通成员变量
    String name;
    String pwd;
    static String company;//静态成员变量

//静态块，只是个语句块，不是方法，不可以去调普通的属性和方法，制作了类的初始化
static{
    System.out.println("执行类的出事话工作");
    company = "北京尚学堂";
    printCompany();
        }

        //静态方法
public static void printCompany(){
    System.out.println(company);
    }

//程序执行的入口
    public static void main(String[] args) {
        User3 u3 = null;
    }
}