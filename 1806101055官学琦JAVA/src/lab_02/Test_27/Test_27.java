package lab_02.Test_27;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test_27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            int i=scanner.nextInt();
            System.out.println(i);
        }catch (InputMismatchException e){
            System.out.println("你输入的不是整数");
        }

    }


}
