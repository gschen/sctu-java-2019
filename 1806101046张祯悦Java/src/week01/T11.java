package week01;
   }
import java.util.Scanner;
public class T11 {

    public static void main(String[] args) {
        System.out.println("请输入一个1到9999的数字：");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num / 1000 != 0){
            System.out.println("这是一个四位数");
        }
        else if(num / 100 != 0){
            System.out.println("这是一个三位数");
        }
        else if(num / 10 != 0){
            System.out.println("这是一个两位数");
        }
        else {
            System.out.println("这是一个一位数");
        }
        int a = num / 1000;
        int b = (num / 100) % 10;
        int c = (num / 10) %10;
        int d = num % 10;
        if(num == (d*1000) + (c*100) + (b*10) + a){
            System.out.println("这个数字是回文数");
        }
        else {
            System.out.println("这不是一个回文数字");
        }
    }
}

