package lab01;

import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-5的数");
        int n = sc.nextInt();
        if (n==1){
            System.out.println("你的成绩不及格哟");}

        else if (n==2){
            System.out.println("你的成绩合格哦");}
        else if(n==3){
            System.out.println("你的成绩中等");  }
        else if(n==4){
            System.out.println("你的成绩良好哦"); }
        else {
            System.out.println("你的成绩优秀"); }
    }

}
class Test_05_1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-5的数");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("你的成绩不及格");
                break;
            case 2:
                System.out.println("你的成绩合格");
                break;
            case 3:
                System.out.println("你的成绩中等");
                break;
            case 4:
                System.out.println("你的成绩良好");
                break;
             default:
                 System.out.println("你的成绩优秀");
                 break;
        }
    }
}