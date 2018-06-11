/**
 * 作者：seak
 * 内容：包装类
 *
 * 时间：2018/06/07 8:33
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class Test01 {
    public static void main(String[] args) {
        /*Integer 类在对象中包装了一个基本类型 int 的值。Integer 类型的对象包含一个 int 类型的字段。

        此外，该类提供了多个方法，能在 int 类型和 String 类型之间互相转换，还提供了处理 int 类型时非常有用的其他一些常量和方法。
*/
        Integer i = new Integer(100);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toHexString(i));

        Integer i2 = Integer.parseInt("234");
        Integer i3 = new Integer("333");
        System.out.println(i2.intValue());
        String str = 234+"";//将234转换成字符串
    }
}
