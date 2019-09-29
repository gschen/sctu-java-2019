package lab_02.Test_030;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//30、 	从键盘读取一个考试分数列表，计算它们的平均分
public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("输入10个数字");
        int sum = 0;
        for (int i = 0; i < 10 ; i++) {
            int j = s.nextInt();
            list.add(j);
            sum += list.get(i);
        }
        System.out.println("平均分为："+ sum/list.size());
    }
}
