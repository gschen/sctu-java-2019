package lab_02.Test_19;

import java.util.Scanner;

import static lab_02.Test_19.T01.reverse;

public class Main {
    public static void main(String[] args) {
        while (true) {
           System.out.println("请输入：");
           Scanner in = new Scanner(System.in);
           String input = in.next();
           if (input == "1"){
               break;
           }
               System.out.println("逆序为：" + '\n' + reverse(input));



       }
    }

}
