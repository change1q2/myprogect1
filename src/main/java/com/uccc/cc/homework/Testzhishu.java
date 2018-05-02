package com.uccc.cc.homework;

/**
 * 作者:seak
 * 内容:打印101-150之间所有的质数(质数:可以被1和自身整除的数)
 * 时间:2018/04/20 11:04
 */
public class Testzhishu {
    public static void main(String[] args) {

        outer:
        for(int i = 101; i<=150; i++){
            inner:
            for(int j =2;j<i/2;j++){
                if(i%j ==0){
                    continue outer;
                }
            }
            System.out.print(i+"\t");

            }
        }
    }

