package PlaneGame08.PlaneGame05;

import java.awt.Graphics;
import java.awt.Image;
/**
 * 作者：seak
 * 内容：
 * 时间：2018/05/23 22:34
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
/*
 * 爆炸类
 */
public class Explode {
    double x, y; //爆炸的位置


    static Image[] imgs = new Image[16];//用数组加载16个图片
    //用循环进行加载
    static {
        for (int i = 0; i < 16; i++) {
            imgs[i] = GameUtil.getImage("images/e" + (i + 1) + ".gif");
            imgs[i].getWidth(null);
        }
    }

    int count;//用来计数

    public void draw(Graphics g) {
        if (count <= 15) {
            g.drawImage(imgs[count], (int) x, (int) y, null);
            count++;
        }
    }
//创建x,y
    public Explode(double x, double y) {
        this.x = x;
        this.y = y;
    }
}