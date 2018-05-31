/**
 * 作者:seak
 * 内容:String的13种常用的方法
 * 时间:2018/05/31 10:42
 */



/**1.定义一个字符串*/
public class StringTestMc {
    private String str = "helloWorld";


    /**2.将字符串变成一个字符数组*/
    public void tocharArry() {
        char c[] = str.toCharArray();//源码中有toCharArray所以str调用的方法名字就是toCharArray
        for(int i = 0;i < c.length; i++){
            System.out.println("转为数组输出:"+c[i]);
        }
    }

    /**
     * 3.从字符串中取出指定位置的字符
     */
    public void tocharAt() {
        char c = str.charAt(3);//源码中是charAt所以str调用的是chatAt而不能是tocharAt(取得一个方法名)
        System.out.println("指定字符:" + c);
    }

    /**
     * 4.将字符串变成一个byte数组
     */
    public void tobyte(){
        byte b[] = str.getBytes();
        System.out.println("转换成byte数组输出:"+new String(b));
    }

    /**5.取得一个字符串长度,length*/
    public void tolength(){
        int l = str.length();
        System.out.println("这个字符串的长度:"+l);
    }

    /**6.查找一个指定字符串是否存在,返回字符串位置,不存在返回-1,indexOf*/
    public void toindexOf(){
        int a1 = str.indexOf("e");//查找字符e的位置
        int a2 = str.indexOf("l",2);//查找l的位置从第三个位置开始查找
        int a3 = str.indexOf("w");//查找w的位置,找不到返回-1
        System.out.println("e的位置:"+a1);
        System.out.println("l的位置:"+a2);
        System.out.println("w的位置:"+a3);
    }

    /**7.去掉字符串左右空格trim*/
    public void  totrim(){
        String str1 = "     hel lo          ";
        System.out.println("去掉左右空格后输出:"+str1.trim());
    }

    /**8.字符串截取*/
    public void tosubstring(){
        System.out.println("截取后的字符:"+str.substring(0,3));//截取0--3位置的内容
        System.out.println("从第三个位置截取:"+str.substring(2));//从第3个位置截取
    }

  /**9.按照指定的字符串拆分字符，拆分的数据将以字符串数组的形式返回*//*
   /*  public void tosplit(){
        String s[] = str.split("e");//按照hello中的e进行字符拆分
        for (int i = 0; i<str.length(); i++){
            System.out.println("拆分后结果："+s[i]);
        }
    }*/

    /**10.将字符串进行大小写转换*/
    public void toUpperCase(){
        System.out.println("把hello变成大写："+str.toUpperCase());
        System.out.println("把HELLO转换为小写:"+str.toUpperCase().toLowerCase());
    }

    /**11判断是否以指定的字符串开头或者结尾*/
    public void tostartsWithOrendWith(){
        if(str.startsWith("he")){
            System.out.println("字符串以he开头");
        }
        if(str.endsWith("ld")){
            System.out.println("字符串以ld结尾");
        }
    }

    /**12.两个String类型内容比较,引用数据类型的比较*/
    public void toequals(){
        String str3 = "world";
        if(str.equals(str3)){
            System.out.println("这两个String类型值相等");
        }else{
            System.out.println("这两个String值不相等");
        }
    }

    /**13.两个字符不区分大小写进行比较*/
    public void toequalsgnoreCase(){
        String str4 = "HELLO";
        if(str.equalsIgnoreCase(str4)){
            System.out.println("hello和Hello忽略大小写比较值相等");
        }
    }

    /**14。将一个制定字符串替换成其他字符串*/
    public void toreplaceAll(){
        String str5= str.replaceAll("l","a");//把l所有l转换成a
        System.out.println("替换后的结果："+str5);
    }



    public static void main(String[] args) {
        StringTestMc Mc = new StringTestMc();
        Mc.tocharArry();
        Mc.tocharAt();
        Mc.tobyte();
        Mc.tolength();
        Mc.toindexOf();
        Mc.totrim();
        Mc.tosubstring();
       // Mc.tosplit();
        Mc.toUpperCase();
        Mc.tostartsWithOrendWith();
        Mc.toequals();
        Mc.toequalsgnoreCase();
        Mc.toreplaceAll();

    }
}

