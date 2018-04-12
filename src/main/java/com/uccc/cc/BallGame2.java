package com.uccc.cc;

import javax.swing.*;
import java.awt.*;

public class BallGame2 extends JFrame{
    //图片加载
  Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
  Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

  double x = 100;//小球的横坐标
  double y = 100;//小球的纵坐标
  double degree = 3.14/3;//弧度
  //paint方法,画窗口
    //遇到懒加载问题,缩小再放大就行
   public void paint(Graphics g){
       System.out.println("窗口被画了一次");
       g.drawImage(desk,0,0,null);
       g.drawImage(ball,(int) x,(int) y,null);

       //把speed变成0就可以停下来
       x = x+10*Math.cos(degree);
       y = y +10*Math.sin(degree);

       //碰到上下边界
       if(y>500-40-30||y<40+40){//500窗口高度,40桌子边框,30球直径,最后一个40标题栏的宽度
           degree = -degree;

       }
       //碰到左右边界
       if(x<40||x>856-40-30){
           degree = 3.14 -degree ;
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
        BallGame2 game = new BallGame2();
        game.launchFrame();

    }
}
