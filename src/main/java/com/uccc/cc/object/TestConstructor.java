package com.uccc.cc.object;

/**
 * 作者:seak
 * 内容:构造方法
 * 时间:2018/04/26 20:06
 */
class Point{
    double x,y;

    //构造方法名称和类必须保持一致
    public Point(double x,double y){
        x = x;
        y = y;
    }
    public double getDistance(Point p){
        return Math.sqrt((x - p.x)*(y - p.y)*(y - p.y));
    }
}
public class TestConstructor {
    public static void main(String[] args){
        Point p = new Point(3.0,4.0);
        Point origin = new Point(0.0,0.0);
        System.out.println(p.getDistance(origin));
    }
}
