package com.uccc.cc;

import java.util.Scanner;

/**
 * 作者:seak
 * 内容:计算出5个学生的平均成绩(用循环来表示)
 * 时间:2018/04/20 16:10
 */
public class Test5schoolchildrenscore {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第1位学生的分数:");
        double score1 = scanner.nextDouble();
        System.out.println("请输入第2位学生的分数:");
        double score2 = scanner.nextDouble();
        System.out.println("请输入第3位学生的分数:");
        double score3 = scanner.nextDouble();
        System.out.println("请输入第4位学生的分数:");
        double score4 = scanner.nextDouble();
        System.out.println("请输入第5位学生的分数:");
        double score5 = scanner.nextDouble();

        System.out.println("他们的平均分是:"+(score1+score2+score3+score4+score5)/5);
*/
       //用for或者while的方法实现
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        for(int i=0 ;i<5;i++){
            System.out.println("请输出第" +(i+1)+"学生的成绩:");
            double score = scanner.nextDouble();
             sum =  sum +score;
        }
        double avg = sum/5;
        System.out.println("他们的平均成绩是;"+avg);
    }
}
