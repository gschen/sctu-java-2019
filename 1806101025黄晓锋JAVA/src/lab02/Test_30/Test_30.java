package lab02.Test_30;


import java.util.Scanner;

public class Test_30 {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要计算学生成绩人数：");
        num = scanner.nextInt();         //输入学生人数
        int [] score = new int[num];    //创建数组来存储学生成绩

        //录入成绩，求平均分【
        for (int i = 0;i<score.length;i++){
            System.out.println("请输入第 " + (i+1) + "位同学的成绩：");
            score[i] = scanner.nextInt();       //录入成绩
            sum += score[i];                    //累加sum
        }
               
        double averagepoint =sum/num;                  //求平均分
        System.out.println("平均分是：" + averagepoint); //打印平均成绩
    }
}
