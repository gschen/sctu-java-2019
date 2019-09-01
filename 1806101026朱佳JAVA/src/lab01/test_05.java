package lab01;

import java.util.Scanner;

public class test_05 {
    public static void main(String []args) {
        Scanner mas = new Scanner(System.in);
        System.out.println("请输入一个1-5的数:");
        int score = mas.nextInt();
        if(score==1){
            System.out.printf("不及格"); }
        else if(score==2){
            System.out.printf("及格"); }
        else if(score==3){
            System.out.printf("中等"); }
        else if(score==4){
            System.out.printf("良好"); }
        else{
            System.out.printf("优秀"); }
    }
}
