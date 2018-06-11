/**
 * 作者：seak
 * 内容：佛循环增强
 * 时间：2018/06/07 8:14
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class ForTest {
    public static void main(String[] args) {
        int[] a = {1,2,323,23,543,12,59};
        //遍历方法1
        for(int i=0; i<a.length;i++){
            int m =a[i];
            System.out.println(m);
        }


        //遍历方法2 DDK5.0新加  X:Y  临时变量：数组
        for(int m:a){
            System.out.println(m);
        }
    }
}
