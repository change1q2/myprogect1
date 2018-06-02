/**
 * 作者：seak
 * 内容：StringBuffer      ---->     字符串变量（线程安全的,效率低）
 *       StringBuilder    ---->     字符串变量（非线程安全的，效率高）
 * 时间：2018/05/31 8:33
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class Test01 {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("abcvf");
        sb.delete(3, 5);
        System.out.println(sb);
    }
}
