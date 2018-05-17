package com.uccc.cc.数组;

/**
 * 作者：seak
 * 内容：数组1
 * 时间：2018/05/17 8:36
 */
public class Test01 {
    public static void main(String[] args) {
        int[] arr01 = new int[10];//声明一个数字，给数组声明空间并指定长度，说明至int数组里面只能放10个数
        String[] arr02 = new String[5];
        User[] arr03 = new User[3];

        //下标直接进行赋值，这叫做静态初始化
        arr01[0] = 13;//索引下标进行赋值
        arr01[1] = 15;
        arr01[2] = 25;

        //可以用循环进行赋值
        for(int i =0;i<10;i++){
            arr01[i] = 10*i;
        }
        //通过循环读取数组元素里卖弄的值
        for(int i =0;i<10;i++){
            System.out.println(arr01[i]);
        }

        //User[] arr03 = new User[3];
        arr03[0] = new User(1001,"搞起");
        arr03[1] = new User(1002,"搞起1");
        arr03[2] = new User(1003,"搞起3");

        for(int i=0;i<arr03.length;i++){
            System.out.println(arr03[i].getName());
        }
    }
}

class  User{
    private int id;
    private String name;

    public User(int id, String name) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}