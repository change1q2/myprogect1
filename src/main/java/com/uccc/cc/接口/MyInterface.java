package com.uccc.cc.接口;

/**
 * 作者：seak
 * 内容：测试接口（逼抽象类还抽象）,只用来设计
 * 时间：2018/05/28 8:28
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
//接口是最抽象的
//接口里面只有常量和抽象方法
public interface MyInterface {
    String MAX_GREAD = "BOSS";
    int MAX_SPEED = 120;

    //修饰符不管你写不写都会有
   /** public abstract*/ void  test01();
    public int test02(int a,int b);

}
