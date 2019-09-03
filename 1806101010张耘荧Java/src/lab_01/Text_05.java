package lab_01;
import java.util.Scanner;

public class Text_05 {
    public static void main(String[] args) {
        //接受从控制台的输入
        Scanner input=new Scanner(System.in);
        System.out.println("请输入成绩结果：");
        //接受对象n
        int score=input.nextInt();
        String str="";

        if (score==1){
            str="不及格";
        }
        else if (score==2){
            str="及格";
        }
        else if(score==3){
            str="中等";
        }
        else if (score==4){
            str="良好";
        }
        else if(score==5){
            str="优秀";
        }
        System.out.println("成绩等级是"+str);
    }
}
