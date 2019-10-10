package lab_02.Test_29;

import java.util.Scanner;

public class Test_29 {
    public static void main(String[] args) {
        int[] i={10,9,8,7};
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        try {

            System.out.println(i[x]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }finally {
            System.out.println("数组的下标最大为3");
        }
    }
}
