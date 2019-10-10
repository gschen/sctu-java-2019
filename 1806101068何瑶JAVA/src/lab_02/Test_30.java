package lab_02;
import java.util.*;
public class Test_30 {
    static double average;

    public static void main(String[] args) {
        double markln;
        Scanner sc=new Scanner(System.in);
        List<Double> marks=new ArrayList<Double>();
        do {
            System.out.println("请输入一名学生成绩[输入负数结束]：");
            markln=sc.nextDouble();
            marks.add(markln);
        }while (markln>=0);
        int len=marks.size()-1;
        marks.remove(len);
        for (int i=0;i<len;i++){
            average+=marks.get(i)/len;
        }
        System.out.println(len+"名学生成绩的平均分为："+average);
    }
}
