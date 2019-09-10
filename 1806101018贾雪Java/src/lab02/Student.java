package lab02;
import java.util.Scanner;
public class Student {
        int computer;
        int english = 0;
        int math;

//    Scanner sc=new Scanner(System.in);
//        System.out.println("请输入你的计算机成绩：");
//        System.out.println("请输入你的数学成绩：");
//        System.out.println("请输入你的英语成绩：");
//    computer=sc.nextInt();
//    english=sc.nextInt();
//    math=sc.nextInt();
//    }
        void printInfo(){
    System.out.println(
            "数学成绩："+this.math+"计算机成绩："+this.computer+"英语成绩："+this.english);
              }
              //求和
    public int sum(){
        return english + computer + math ;
    }
//    求平均值
    public int  avg(){
            return this.sum()/3;
    }
    //求最大值
    public int max(){
        int max = computer>math?computer:math ;
        max = max>english?max:english ;
        return max ;
    }
    //求最小值
    public int min(){
       int min = computer<math?computer:math ;
        min = min<english?min:english ;
        return min ;
    }
    public static void main(String[] args) {
        Student st=new Student();
        st.computer=70;
        st.english=80;
        st.math=90;
        st.printInfo();
        System.out.println("总分为："+st.sum()+"\n"+"平均分："+st.avg()+"\n"+"最高分为："+st.max()+"\n"+"最低分为："+st.min());

    }
}
