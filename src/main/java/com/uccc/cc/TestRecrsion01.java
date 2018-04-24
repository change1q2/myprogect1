package com.uccc.cc;

/**
 * 作者：seak
 * 内容：递归测试
 * 1自己调用自己
 * 2需要定义头和尾
 * 3耗资源慎用
 * 时间：2018/04/23 20:38
 */
public class TestRecrsion01 {
    public static void main(String[] args) {
       a();
    }
//递归要有开始和结束否者会无限循环调用知道奔溃
    static int count;//写在a()外面才能进行循环
    static void a(){
       // int count = 0;
        System.out.println("a");
         count++;
         if(count<10){
             a();
         }else {
             return;
         }
    }
}