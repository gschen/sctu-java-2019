package lab_02.Test_30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_30 {
    static double Average;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>();
        Double mark;
        do {
            System.out.println("请输出分数：");
            mark = sc.nextDouble();
            list.add(mark);
        } while (mark>=0);
        int len =list.size()-1;
        list.remove(len);
        System.out.println(list);
        for (int i = 0; i <len ; i++) {
            Average +=list.get(i)/len;
        }
        System.out.println("平均成绩是："+Average);
    }
}
