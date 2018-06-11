/**
 * 作者：seak
 * 内容：测试自动装箱和拆箱
 * 时间：2018/06/08 7:23
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class Test02 {
    public static void main(String[] args) {
        //Integer a1 = new Integer(1000);//跟下面一样，编译器帮我们自动改进代码

        Integer a = 1000;//jdk 5.0以后，自动装箱
        Integer b = 1000;


        int c = new Integer(1500);//编译器改进 new Integer(1500).IntVaule

        int c1 = b;//编译器改进 b.intVaule

        System.out.println(c1);

    }
}
