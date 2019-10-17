package lab02.Test_13;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入课程数目：");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        double[] scores = new double[num];
        System.out.println("请输入学生课程成绩：");
        Scanner score = new Scanner(System.in);
        for (int i = 0; i < num ; i++) {
            scores[i] = score.nextDouble();
        }
//        Gtmnastics g = new Gtmnastics();
//        System.out.println(g.average(scores));
        School as = new School();
        System.out.println(as.average(scores));

    }
}
