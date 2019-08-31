package lab_01;
import java.util.Scanner;


public class Text_04 {
    public static void main(String[] args) {
        //接受从控制台的输入
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个整数n，使程序从1+···+n,n=");
        //接受对象n
        int n=input.nextInt();
        int sum1=0;

        //for循环
        for (int i = 1; i <=n; i++) {
            sum1=sum1+i;
        }
        System.out.println("for循环求解的结果"+sum1);

        //while循环
        int j=1;
        int sum2=0;
        while (j<=n){
            sum2=sum2+j;
            j++;
        }
        System.out.println("while循环求解的结果"+sum2);

        //do while 循环
        int x=1;
        int sum3=0;
        do{
            sum3=sum3+x;
            x++;
        }
        while (x<=n);
        System.out.println("do while循环求解的结果"+sum3);
    }
}
