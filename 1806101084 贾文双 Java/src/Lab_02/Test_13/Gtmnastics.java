package Lab_02.Test_13;

import java.util.Scanner;

//Gymnastics类中计算选手的平均成绩的方法是去掉一个最低分，去掉一个最高分，然后求平均分
public class Gtmnastics extends ComputerAverage{
    private double max = 0,min,all = 0;
    @Override
    public double average(double[] score) {
        min = score[0];
        for (int i = 0; i < score.length ; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
            all += score[i];

        }
        System.out.print("平均分为");
        return (all - max - min)/(score.length - 2);
    }
}
