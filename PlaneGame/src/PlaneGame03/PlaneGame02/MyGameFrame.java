package PlaneGame03.PlaneGame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 作者：seak
 * 内容：飞机游戏的主窗口
 * 时间：2018/05/19 17:54
 */
/*记住2点：
        1.常量 ：MAC_VALUE
        2.类名：class Man
3.其他都是驼峰原则：monthSalary*/


public class MyGameFrame extends JFrame {//首先创建一个public class类  用extends继承DFrame里面的所有属性

    Image plane = GameUtil.getImage("images/plane.png");
    Image bg = GameUtil.getImage("images/bg.jpg");

    int planeX = 250, planeY =250;

    @Override
    public void paint(Graphics g){//自动被调用, g 相当于一直画笔
       g.drawImage(bg,0,0,null);
       g.drawImage(plane,planeX,planeY,null);
        planeX++;
    }
    //定义一个内部内，可以直接用类的属性，帮助我们重划窗口
    class PaintThewad extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("窗口画一次");
                repaint();//重画

                try{
                Thread.sleep(40);//1s=1000ms,会报一场用一场处理机制try...catch就行了
            }catch(InterruptedException e){
                e.printStackTrace();
                }
            }
        }

    }




    //初始化窗口
    public void launchFrame(){//写一个lanuchFrame方法
        this.setTitle("海海的飞机大战");//用this.set调用Frame里面的属性方法，给框命名title
        this.setVisible(true);//一个图形界面默认都是不可见的，setVisible是把图形界面设置为可见
        this.setSize(500,500);//给框设置高度和宽度
        this.setLocation(300,300);//给图形框设置位置

        //调用一个结束图形界面的方法，因为正常点击右上角的X事伪结束，实际代码程序还在运行
        this.addWindowFocusListener(new WindowAdapter() {

            @Override//@Override是伪代码，它表示方法重写
            public void windowClosing(WindowEvent e){
                System.exit(0);//0表示正常结束

            }
        });

        new PaintThewad().start();//启动线程

    }



    public static void main(String[] args){//程序的入口
        MyGameFrame f = new MyGameFrame(); //一个普通类MyGameFrame无法直接使用，我们new一个就是新产生的对象f，使用它才可以调用MyGameFrame中的各种方法
        f.launchFrame();//用对象f来调用launchFrame方法
    }


}
