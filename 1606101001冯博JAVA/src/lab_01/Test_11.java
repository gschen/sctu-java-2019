package lab_01;
import java.util.Scanner;
public class Test_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个数1-9999之间的数：");
        int i = scan.nextInt();
        int count = 0;
        while(i != 0){
            i /= 10;
            count++;
        }
        System.out.println(count);
    }
}


