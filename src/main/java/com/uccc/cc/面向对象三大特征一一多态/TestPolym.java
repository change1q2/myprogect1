package com.uccc.cc.面向对象三大特征一一多态;

/**
 * 作者：seak
 * 内容：测试多态（条件，继承，重新，弗雷引用）
 * 时间：2018/05/16 8:46
 */
      /*  new其实就是创建对象用的，如果在B类中要调用另A类里的方法，那么就是先在B类里NEW一个A类，如：A a=new A()，
        然后用NEW的对象a去调用A类里的方法，如：a.方法名，就可以在B类里用了 如果A类里是静态方法那就不用NEW A类了，
        直接用A类的类名去点方法，如： A.方法名 A a=new A()，
        其实就是a是A类的一个实例，就是用实例a去调用A类的方法的new是java是最常见的，同样也很重要。*/
public class TestPolym {
    public static void main(String[] args) {
    Animal a = new Animal();
    animalCry(a);

    Dog d = new Dog();
    animalCry(d);
    }
    //定义一个静态方法调用Animal a
    static void animalCry(Animal a){
        a.shout();
    }
}

//定义一个class类，定义一个void方法
class Animal{
    public void shout(){
        System.out.println("叫了一声");
    }
}

//继承animal，并重写shout的属性
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵");
    }
}

