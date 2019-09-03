package lab_01;
import java.util.*;
public class Test_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int j = sc.nextInt();
        String str="";
        if (85<=j){
            str = "A级";
        }
        else if (70<=j&&85>j){
            str = "B级";
        }
        else if (60<=j&&70>j){
            str = "C级";
        }
        else if(60<j){
            str = "D级";
        }
        else{
            str = "输入有误！";
        }
        System.out.println("学生成绩等级为："+ str);
    }
}

