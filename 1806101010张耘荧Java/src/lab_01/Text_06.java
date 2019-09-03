package lab_01;
import java.util.Scanner;

public class Text_06 {
    public static void main(String[] args) {
        //接受从控制台的输入
        Scanner input=new Scanner(System.in);
        System.out.println("请输入成绩等级：");
        //接受对象grade
        String grade=input.next();

        String str="";
        char ch = grade.charAt(0);
        input.close();
        if (ch == 'A'){
            str="成绩在85分以上（包扣85）";
        }
        else if (ch =='B'){
            str="成绩在85-70分以内（包扣70）";
        }
        else if (ch =='C'){
            str="成绩在70-60分以内（包扣60）";
        }
        else if (ch =='D'){
            str="成绩在60分以下";
        }
        System.out.println(str);

    }
}
