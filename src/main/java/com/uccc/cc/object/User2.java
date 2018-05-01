package com.uccc.cc.object;

/**
 * 作者：seak
 * 内容：static关键字 它属于类不属于对象修饰成员变量
 * 时间：2018/05/01 17:24
 */
public class User2 {
   //三个普通的属性 int String
    int id;
    String name;
    String pwd;

    //一个特殊的属性static
    static String company = "尚学堂";


    public User2(int id, String name) {
        this.id = id;//this代表当前对象
        this.name = name;
    }

    //登陆方法(一个普通的方法)
    public void login() {
        System.out.println("登录：" + name);
    }

    //static方法，跟在static后面的方法就是静态方法
    public static void printCompany() {
        System.out.println(company);
    }
    //程序的运行方法
    public static void main(String[] args) {
        User2 u = new User2(101, "海海"); //建了一个对象 （new一个对象）
        User2.printCompany();//调用printCompany方法
        User2.company = "北京阿里巴巴";//通过类名去调用company
        User2.printCompany();
    }
}