package com.uccc.cc;

/**
 * 作者:seak
 * 内容:2006年培养8万人,每年增长25%,,请问那一年培训学院达到200000人?
 * 时间:2018/04/20 14:33
 */
public class SchoolMorePeople {
    public static void main(String[] args) {

        int year = 2006;
        double people = 8;
        while(people<=20){
            people =people* (0.25+1);
            year ++;
        }
        System.out.println(year);
    }
}
