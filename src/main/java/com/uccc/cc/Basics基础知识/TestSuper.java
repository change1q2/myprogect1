package com.uccc.cc.Basics基础知识;

/**
 * 作者：seak
 * 内容：测试super
 * * 时间：2018/05/06 22:24
 */
public class TestSuper {
    public static void main(String[] args) {
        System.out.println("开始创建一耳光ChildClass对象。。。");
      //new ChildClass();
    //问题无法从静态上下文中引用非静态变量this

    }






    //创建了一个父类
    class FatherClass{
        public FatherClass(){
            super();
            System.out.println("创建Fatherclass");
        }
    }

    //创建一个子类并且继承父类
     class ChildClass extends FatherClass{
        public ChildClass(){//重写父类
            super();//不管写不写都要生成super用来调用父类
            System.out.println("创建ChildClass");
        }
    }
}
