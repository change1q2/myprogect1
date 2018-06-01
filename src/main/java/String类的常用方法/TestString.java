package String类的常用方法;

/**
 * 作者：seak
 * 内容：1.练习String类的常用方法
 * 2.结合数组查看源码
 * 时间：2018/05/30 21:25
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class TestString {
    public static void main(String[] args) {
        String str = new String("avbf");
        System.out.println(str.charAt(2));

        System.out.println("Abc".equalsIgnoreCase("abc"));
    }
}
