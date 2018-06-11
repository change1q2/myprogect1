/**
 * 作者：seak
 * 内容：测试时间
 * 时间：2018/06/08 7:47
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
import java.util.Date;
public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        long t = System.currentTimeMillis();
        System.out.println(t);
        Date d2 = new Date(1000);

        d2.setTime(2312312);
        System.out.println(d2.getTime());
        System.out.println(d.getTime()<d2.getTime());
    }


}
