package lab_01;
import java.util.Scanner;
public class Test07 {
    public static void main(String[] args) {
        System.out.println("给你一个1—100之间的数，请猜测这个数字");
        int yourguess;
        Scanner Sc=new Scanner(System.in);
        System.out.println("请输入你的猜想：");
        yourguess=Sc.nextInt();
        int realNumber=(int)(Math.random()*100)+1;
//        System.out.println("这个数字为："+realNumber);

        if (realNumber==yourguess){
            System.out.println("你猜对了！");
        }
        else if (realNumber<yourguess){
            System.out.println("你猜大了！");
        }
        else if (realNumber>yourguess){
            System.out.println("你猜小了！");
        }



    }
}