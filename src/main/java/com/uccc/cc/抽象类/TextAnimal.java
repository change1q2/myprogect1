package com.uccc.cc.抽象类;

/**
 * 作者：seak
 * 内容：
 * 时间：2018/05/25 22:13
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class TextAnimal {
    //Animal a = new Animal() //不能调抽象类
  //   Animal a1 = new Cat();//必须用子类对象去引用类容

    public static void main(String[] args) {
        //System.out.println();
        Animal a1 = new Cat();//必须用子类对象去引用类容
        a1.run();
    }


}


