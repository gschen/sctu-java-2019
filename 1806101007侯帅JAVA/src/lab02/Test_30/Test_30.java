package lab02.Test_30;

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
        } while (mark>=0);//当输入值大于等于0的时候才执行，否则停止
        int len =list.size()-1;//将负数删除
        list.remove(len);//删除最后一个负数
        System.out.println(list);
        for (int i = 0; i <len ; i++) {
            Average +=list.get(i)/len;
        }

        System.out.println("平均成绩是："+Average);
    }
}
