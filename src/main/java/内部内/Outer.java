package 内部内;

/**
 * 作者：seak
 * 内容：内部类
 * 时间：2018/05/29 7:54
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 * 条件：
 * 1.非静态内部类对象单属于外部类的某个对象
 * .2.普通成员部类只能定义普通属性
 *
 * 3.静态内部类
 * a.当一个静态内部类杜希昂存在，并不一定存在对应的外部类对象
 * b.静态内部类看作外部类的一个静态成员
 *
 * 总结：
 * 1.普通的成员内部类可以访问外部的类的普通的属性方法
 * 2.普通的成员内部类必须先有外部内对象才能有内部类对象
 * 3.静态内部类看作成员变量，外部内对象不一定有，可以直接访问外部类的普通属性和方法
 */
public class Outer {
    public static void main(String[] args) {
        /*Nose n = new Nose();//不能直接掉内部类*/

        Face f = new Face();//需要先new外部内
        Face.Nose n =f.new Nose();//然后再new内部类

        Face.Nose n1 = new Face().new Nose();//相当于上面2行代码合并的效果

       Face.Ear e = new Face.Ear();//外部内创建静态内部类，静态内部类相当于外部类的一个静态成员变量，所以用成员变量的方式使用它就行
       e.listenn();
    }

}
class  Face{
    int size;
    int type;
    String shape = "圆脸";

    //内部类
    //普通的成员内部类可以访问外部的类的普通的属性方法
    class Nose{
        int type;

        void breath(){
            System.out.println(this.type);//this表示自己本身的内，这里表示 Nose类，调用里面的type属性
            System.out.println(Face.this.type);//这里加了Face表示调用的Face的type属性
            System.out.println("呼吸");
        }
    }

    static class Ear{
        void listenn(){
            //System.out.println(shape);静态内部内不能直访问外部类的实例方法
            System.out.println("听");
        }
    }
}
