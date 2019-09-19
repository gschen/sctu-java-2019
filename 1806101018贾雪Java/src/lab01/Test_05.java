package lab_01;
import java.util.Scanner;
public class Test_05 {
    public static void main(String[] args) {
        int score;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        score=sc.nextInt();
        String str="";
        switch (score){
            case 1:
                str="不及格";
                break;
            case 2:
                str="及格";
                break;
            case 3:
                str="中等";
                break;
            case 4:
                str="良好";
                break;
            case 5:
                str="优秀";
                break;
        }
        System.out.println("该成绩为:"+score+"并且等级为："+str);
    }
}
