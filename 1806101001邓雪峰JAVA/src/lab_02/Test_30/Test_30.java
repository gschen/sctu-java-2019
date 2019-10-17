package lab_02.Test_30;

import lab_02.Test_06.Ladder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_30 {
    static double average;

    public static void main(String[] args) {
        double markIn;
        Scanner sc = new Scanner(System.in);
        List<Double> marks = new ArrayList<Double>();
        do {
            System.out.print("请输入成绩[输入负数结束]:");
            markIn = sc.nextDouble();
            marks.add(markIn);
        }
        while (markIn>=0);
        int len = marks.size() - 1;
        marks.remove(len);
        for (int i = 0 ;i < len;i++){
            average +=marks.get(i)/len;
        }
        System.out.println(len+"项成绩平均分为："+average);
    }
}
