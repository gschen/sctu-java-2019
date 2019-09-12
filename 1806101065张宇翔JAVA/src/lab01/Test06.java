package lab01;
import java.util.Scanner;
public class Test06 {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String c;
        char str[];
        char c1;
        System.out.println("输入一个等级：");
        c=reader.nextLine();  //等待用户在命令行输入一行文本回车，即以回车结束
        str=c.toCharArray();  //将此字符串转化为一个新12的字符数组
        c1=str[0];
        //System.out.println(str);
        switch(c1){
            case 'A' :System.out.println("成绩范围为：[85,100]");break;
            case 'B' :System.out.println("成绩范围为：[70,85)");break;
            case 'C' :System.out.println("成绩范围为：[60,70)");break;
            case 'D' :System.out.println("成绩范围为：[0,60)");break;
            default: System.out.println("输入有误");break;
        }
    }
}
