package week_01;
import java.util.Scanner;

public class Test_2_9_2 {
    public static void main(String[] args) {
        System.out.println("请输入分数：");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        i = i / 5;
        String str="";
        switch (i) {

            case 1:
                str=("不及格");
                break;
            case 2:
                str=("及格");
                break;
            case 3:
                str=("中等");
                break;
            case 4:
                str=("良好");
                break;
            case 5:
                str=("优秀");
                break;

        }

        System.out.println(str);
    }
}

