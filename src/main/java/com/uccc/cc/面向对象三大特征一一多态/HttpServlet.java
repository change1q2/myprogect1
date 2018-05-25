package com.uccc.cc.面向对象三大特征一一多态;

/**
 * 作者：seak
 * 内容：serv;et中方法调用
 * 时间：2018/05/25 8:25
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
//service调doGet,doGet调子类的doGet，所以最后输出的  MyServlet
public class HttpServlet {
    public void service(){
        System.out.println("HttpServelt.service()");
        this.doGet();
    }

    public void doGet(){
        System.out.println("HttpServelt.service()");
    }
}
