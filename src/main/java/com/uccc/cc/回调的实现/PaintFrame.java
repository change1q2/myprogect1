package com.uccc.cc.回调的实现;

import java.awt.*;

/**
 * 作者：seak
 * 内容：回掉--就是多态
 * 时间：2018/05/28 21:52
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class PaintFrame {
    public void drawiFrame(MyFrame f){
        System.out.println("启动线程'");
        System.out.println("增加循环");
        System.out.println("查看消息站");


        //画窗口
        f.paint();

        System.out.println("启动缓存'");




        //启动二级缓存
    }

    public static void main(String[] args) {
        drawFrame();
    }

    private static void drawFrame() {
    }
}

class  GameFrame1 extends MyFrame{
    public void paint(){
        System.out.println("GameFrame01.paint()'");
        System.out.println("话窗口");
    }
}
