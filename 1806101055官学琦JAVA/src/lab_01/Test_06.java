package lab_01;
import java.util.Scanner;

public class Test_06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入你的等级：");
    String x=input.next();
        if (x.equals("A")){
        System.out.println("你的成绩在85分以上包含85分");
    }
        else if (x.equals("B")){
        System.out.println("你的成绩在70分到85分（包含70分，不包含85分）");
    }
        else if (x.equals("C")){
        System.out.println("你的成绩在60分到70分（包含60分，不包含70分）");
    }
        else if (x.equals("D")){
        System.out.println("你的成绩在60分以下（不包含60分）");
    }
        else{
        System.out.println("没有此等级，你是外星来的吧");
    }
}
}
