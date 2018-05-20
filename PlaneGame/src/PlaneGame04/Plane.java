package PlaneGame04;

import java.awt.*;

/**
 * 作者：seak
 * 内容：定义飞机封装画飞机的方法，可以在主程序调用
 * 时间：2018/05/20 19:32
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class Plane extends GameObject {
    public void drawSelf(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);
        x++;
    }
    //定义一个构造器
    public Plane(Image img,double x,double y){
        this.img = img;
        this.x = x;
        this.y = y;
    }
}
