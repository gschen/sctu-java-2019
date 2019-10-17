package lab_02;
import java.util.Scanner;

public class Test_03 {
    int coumpter;
    int math;
    int english;

    int sum(){
        return coumpter+math+english;
    }

    double averRage(){
        return (coumpter+math+english)/3;
    }

    public  int max(){
        if (coumpter>math && coumpter>english){
            return 1;
        }
        if (math>coumpter && math>english){
            return 2;
        }
         if (english>coumpter && english>math){
           return 3;
        }
         return 4;

   }

   public int mini(){
        if (coumpter<math && coumpter<english){
            return -1;
        }
        if (math<coumpter && math<english){
            return -2;
        }
        if (english<coumpter && english<math){
            return -3;
        }
        return 0;

   }

    public static void main(String[] args) {

        Test_03 grade = new Test_03();
        Scanner input = new Scanner(System.in);
        System.out.println("请分别输入三项成绩!");
        System.out.println("请输入电脑成绩：");
        grade.coumpter = input.nextInt();
        System.out.println("请输入数学成绩：");
        grade.math = input.nextInt();
        System.out.println("请输入英语成绩：");
        grade.english = input.nextInt();

        System.out.println("总分为："+grade.sum());
        System.out.println("平均分为"+grade.averRage());



        int n;
        n = grade.max();
        switch (n){
            case 1:System.out.println("最高成绩为电脑成绩:"+grade.coumpter);break;
            case 2:System.out.println("最高成绩为数学成绩:"+grade.math);break;
            case 3:System.out.println("最高成绩为英语成绩:"+grade.english);break;
            case 4:System.out.println("程序完整运行");break;
        }


        int x;
        x = grade.mini();
        switch (x){
            case -1:System.out.println("最低成绩为电脑成绩:"+grade.coumpter);break;
            case -2:System.out.println("最低成绩为数学成绩:"+grade.math);break;
            case -3:System.out.println("最低成绩为英语成绩:"+grade.english);break;
            case 0:System.out.println("程序完整运行");break;

        }

        System.out.print("该生基本信息为："+"电脑成绩为:"+grade.coumpter+";");
        System.out.print("数学成绩为:"+grade.math+";");
        System.out.print("英语成绩为:"+grade.english+";");
        System.out.print("英语成绩为:"+grade.english+";");
        System.out.print("总分为:"+grade.sum()+";");
        System.out.print("平均分为:"+grade.averRage()+";");
        //System.out.print("最高分为:"+grade.max());
       // System.out.print("最低分为:"+grade.mini());
        n = grade.max();
        switch (n){
            case 1:System.out.println("最高成绩为电脑成绩:"+grade.coumpter);break;
            case 2:System.out.println("最高成绩为数学成绩:"+grade.math);break;
            case 3:System.out.println("最高成绩为英语成绩:"+grade.english);break;
            case 4:System.out.println("程序完整运行");break;
        }
        System.out.print(";");

        x = grade.mini();
        switch (x){
            case -1:System.out.println("最低成绩为电脑成绩:"+grade.coumpter);break;
            case -2:System.out.println("最低成绩为数学成绩:"+grade.math);break;
            case -3:System.out.println("最低成绩为英语成绩:"+grade.english);break;
            case 0:System.out.println("程序完整运行");break;

        }



    }

}
