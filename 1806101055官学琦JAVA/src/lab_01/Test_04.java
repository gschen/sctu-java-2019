package lab_01;
import java.util.Scanner;

public class Test_04 {
    public static void main(String[] args) {
        //方法1for循环
        Scanner input=new Scanner(System.in);
        System.out.print("输入你想求的1到这个数的总和，你输入的数为：");
        int x=input.nextInt();
        int y=0;
        for (int i = 1; i <=x ; i++) {
            y=i+y;
        }
        System.out.println("输出的值为1到输入值的总和，总和为："+y);
        //方法二while循环
        while (y<=x){
            y=y+1;
        }
        System.out.println("输出的值为1到输入值的总和，总和为："+y);
        //第三种方法do while
        do {
            y=y+1;
        }while (y<=x);
        System.out.println("输出的值为1到输入值的总和，总和为："+(y-1));
    }
}
