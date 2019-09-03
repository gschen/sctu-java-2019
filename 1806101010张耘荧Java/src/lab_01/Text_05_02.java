package lab_01;
import java.util.Scanner;

public class Text_05_02 {
    public static void main(String[] args) {
        //接受从控制台的输入
        Scanner input=new Scanner(System.in);
        System.out.println("请输入成绩结果：");
        //接受对象n
        int n=input.nextInt();
        String str="";

        switch (n){
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
        System.out.println("成绩等级为"+str);
    }
}
