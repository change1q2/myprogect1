package com.uccc.cc.抽象类;

/**
 * 作者：seak
 * 内容：抽象类,只能用建好来被继承
 * 时间：2018/05/25 21:48
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
/*public class Animal {
   *//* public void run(){

    }//每个动物的跑法都不同这样要定义很多个干脆就不定义了用sbstart*//*


}*/

    //抽象类，包含了抽象方法的类
public abstract class Animal {

    public abstract void run();//抽象方法的意义在于将方法的设计和方法的实现分离了

    //可以一样定义普通方法
    public void breath(){
        System.out.println("呼吸'");
        run();
    }

}
    class  Cat extends Animal {

        @Override
        public void run() {
            System.out.println("喵步");
        }
    }

    class Dog extends Animal{
        @Override
        public void run() {
            System.out.println("狗跑");

        }

    }



   /*    public static void main(String[] args) {
            Animal a = new Cat();

            }*/


