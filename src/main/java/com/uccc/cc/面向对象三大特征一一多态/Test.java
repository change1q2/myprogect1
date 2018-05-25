package com.uccc.cc.面向对象三大特征一一多态;

/**
 * 作者：seak
 * 内容：
 * 时间：2018/05/25 8:30
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class Test {
    public static void main(String[] args) {
        HttpServlet s = new HttpServlet();//一个普通类HttpServlet无法直接使用，我们new一个就是新产生的对象f，使用它才可以调用HttpServlet中的各种方法
        HttpServlet s2 = new MyServlet();//一个普通类HttpServlet无法直接使用，我们new一个就是新产生的对象f，使用它才可以调用MyServlet中的各种方法
        s.doGet();
        s2.doGet();
    }
}
