package com.uccc.cc.接口;

/**
 * 作者：seak
 * 内容：
 * 时间：2018/05/28 8:34
 * 命名规则
 * 常量：MAC_VALUE
 * 类名：class Man
 * 其他：驼峰
 */
public class MyClass implements MyInterface {
    @Override
    public void test01() {
        System.out.println("test01");
    }

    @Override
    public int test02(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }
}
