import java.text.SimpleDateFormat;

/**
 * 作者：seak
 * 内容：
 * 时间：2018/06/08 8:09
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
import java.util.Date;
import java.text.DateFormat;
public class TestDateFormat {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Date d = new Date(123312312L);
        String str = df.format(d);//将时间对象格式化字符串
        System.out.println(str);
        System.out.println("######################");
        String str2 = "1977-7-7";
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date d2 = df2.parse(str2);
            System.out.println(d2);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
