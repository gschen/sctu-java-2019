package lab_01;
import java.util.*;
public class Test_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-5之间的数：");
        int i = sc.nextInt();
        String str="";
        switch (i){
            case 1:
                str = "不及格";
                break;
            case 2:
                str = "及格";
                break;
            case 3:
                str = "中等";
                break;
            case 4:
                str = "良好";
                break;
            case 5:
                str = "优秀";
                break;
            default:
                str = "输入有误";
            }
            System.out.println("学生成绩为："+ str);
    }
}
