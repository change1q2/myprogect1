package PlaneGame04;

import java.awt.*;

/**
 * 作者：seak
 * 内容：游戏的父类
 * 时间：2018/05/20 19:19
 */
public class GameObject {
     Image img;
     double x,y;
     int speed;
     int width,height;

    public void drawSelf(Graphics g){

        g.drawImage(img,(int)x,(int)y,null);
    }
    //加入构造器Constructor

    public GameObject(Image img, double x, double y, int speed, int width, int height) {
        super();
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image img, double x, double y) {
        super();
        this.img = img;
        this.x = x;
        this.y = y;
    }
    //加入无参构造器
    public  GameObject(){

    }

    /**
     * 返回物体所在的矩形。便于后续的碰撞检测
     * @return
     */
    public  Rectangle   getRect(){
        return  new Rectangle((int)x, (int)y, width, height);
    }

}
