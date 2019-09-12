package Lab01;

import java.util.Random;
import java.util.Scanner;

public class Lab01_07 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(500);
        int judge=0;

        while (judge==0){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入一个0~500的数：");
            int grade=sc.nextInt();
            if (grade==i)judge=1;
            else if (grade>i)System.out.println("猜大了");
            else System.out.println("猜小了");}

        if (judge==1)System.out.println("猜对了");

    }
}
