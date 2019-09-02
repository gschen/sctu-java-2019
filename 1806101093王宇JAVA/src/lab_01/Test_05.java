package lab_01;

import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入(整数1-5)：");
        int i = s.nextInt();
        if (i==1){
                System.out.println("不及格");

            }
            else if (i==2){
                System.out.println("及格");
            }
            else if (i==3){
                System.out.println("中等");
            }
            else if (i==4){
                System.out.println("良好");
            }
            else if (i==5){
                System.out.println("优秀");
            }
        }
    }

