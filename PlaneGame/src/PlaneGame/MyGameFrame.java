package PlaneGame;

import javax.swing.*;
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
/*只是补充
一、this关键字主要有三个应用：
        (1)this调用本类中的属性，也就是类中的成员变量；
        (2)this调用本类中的其他方法；
        (3)this调用本类中的其他构造方法，调用时要放在构造方法的首行。
        Public Class Student {
        String name; //定义一个成员变量name
private void SetName(String name) { //定义一个参数(局部变量)name
        this.name=name; //将局部变量的值传递给成员变量，this指的就是studengt对象，将局部变量setName中（String name）的值传递给成员变量name
        }
        }*/
//调用其它类中的方法
/*public class Student { //定义一个类，类的名字为student。
    public Student() { //定义一个方法，名字与类相同故为构造方法
        this(“Hello!”);
    }
    public Student(String name) { //定义一个带形式参数的构造方法
    }
}*/
//初始化窗口
public class MyGameFrame extends JFrame {//首先创建一个public class类  用extends继承DFrame里面的所有属性

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
    }

    public static void main(String[] args){//程序的入口
        MyGameFrame f = new MyGameFrame(); //一个普通类MyGameFrame无法直接使用，我们new一个就是新产生的对象f，使用它才可以调用MyGameFrame中的各种方法
        f.launchFrame();//用对象f来调用launchFrame方法
        }
   /* new说明
    一个普通类在没有实例化之前,就是new之前,它的属性,方法等等在内存中都是不存在的.
     只有new了以后,这个类的一些东西在内存中才会真的存在,也就是说只有new了之后,这个类才能用

    [已经存在的类名] [要产生的对象名称]=new [已经存在的类名](参数);
    这句话的的意思就是新产生一个对象，以后就用产生的对象来做事，多练习联系你的体会就会更深刻的*/
   /*String  str = new String（“aaa”）；
    解释：以上就是先创建一个实例化对象“aaa”，存储到内存中，之后将此值赋值给str；

    User user = new User（）；
    解释：以上就是先创建一个实例化对象User，存储到内存中，之后将此值赋值给user；*/
        /*  A a=new A(); 表示通过A类的构造方法实例化A类的一个对象并且赋值给a*/

        }
