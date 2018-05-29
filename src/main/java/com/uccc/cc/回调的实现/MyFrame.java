package com.uccc.cc.回调的实现;

import java.awt.*;

/**
 * 作者：seak
 * 内容：
 * 时间：2018/05/28 21:55
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class MyFrame {
    public void paint(Graphics g){
        System.out.println("画出创库");
    }

    public void paint() {
    }
}
interface  IMyFrame{
    void paint();
}
