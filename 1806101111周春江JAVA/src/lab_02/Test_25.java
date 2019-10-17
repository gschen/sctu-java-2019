package lab_02;

import java.util.Scanner;

public class Test_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        int a = sc.nextInt();
        System.out.println();
        int b = sc.nextInt();


        try {
            System.out.println(a/b);
        }catch (Exception e){
            System.out.println("被0除");
        }
        finally {

        }

    }
}
