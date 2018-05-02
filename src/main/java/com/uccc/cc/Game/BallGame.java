/**
 * 小球移动
 * 作者:王海军
 */
package com.uccc.cc.Game;


import java.awt.*;//AWT 是抽象窗口组件工具包，是 java 最早的用于编写图形节目应用程序的开发包。
import javax.swing.*;//Swing 是为了解决 AWT 存在的问题而新开发的包，它以 AWT 为基础的
public class BallGame extends JFrame{
    //图片加载
  Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");//awt里面的Toolkit用getDefaultTookit方法应用到getImage类型,("images/ball.png")图片的位置和名字
  Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

  double x = 100;//小球的横坐标
  double y = 100;//小球的纵坐标
    boolean right =true;//方向
  //paint方法,画窗口
    //遇到懒加载问题,缩小再放大就行
   public void paint(Graphics g){ //(Graphics g)?
       System.out.println("窗口被画了一次");
       g.drawImage(desk,0,0,null);
       g.drawImage(ball,(int) x,(int) y,null);
       g.drawImage(ball,(int) x,(int) y,null);



       //小球到边缘如何来回弹动?
        if(right){
            x = x+10;
        }else{
            x = x - 10;
        }
        if(x>856-40-30){//30小球的直径,40桌子的边框
            right = false;

        }
        if(x<40){//40桌子边框的宽度
            right = true;
        }

   }
   //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);

        //重画窗口,每秒25次
        while(true){
            repaint();
            //try....catch处理Thread异常的方式
            try{
            Thread.sleep(40);//40没事 1s=1000ms
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
    //main方法是程序执行的入门
    public static void main(String[] args){
        System.out.print("希望学的快乐");
        BallGame game = new BallGame();
        game.launchFrame();

    }
}
