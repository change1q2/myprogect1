package com.uccc.cc.Basics基础知识;

import java.util.Objects;

/**
 * 作者：seak
 * 内容：V测试equals * 时间：2018/05/05 22:04
 */
public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;
        User u1 = new User(1000,"搞起","123456");
        User u2 = new User(1000,"搞2起","123456");

        System.out.println(u1 == u2);
       // System.out.println(u1.equals(u2));
    }
    static class User {
        int id;
        String name;
        String pwd;


        public User(int id, String name, String pwd) {
            super();
            this.id = id;
            this.name = name;
            this.pwd = pwd;
        }
       /* public boolean equals(Object obj){
            return id
        }*/

        @Override//equals固定写法套路
        public boolean equals(Object obj) {
            if (this == obj) //如果传递的obj与我相等则返回真，因为是同一个对象
                return true;
            if(obj == null)//如果传递的obj是空则返回flase
                return false;
            if(getClass()!= obj.getClass())//如果类型不同直接false
                return false;
            /*if (!(obj instanceof User))
                return false;*/
            User other = (User) obj;//强制转型
            if(id != other.id)//再比较id不想等返回false
                return false;
            return true;
            //return id == user.id;
        }




      /*  @Override//散列吗
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime*result + id;
            return result;
            //return Objects.hash(id);
        }*/
    }
}
