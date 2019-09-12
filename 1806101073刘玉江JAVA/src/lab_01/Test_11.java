package lab_01;
import java.util.Scanner;
public class Test_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        if (1<=x & x<=99999){
            String y=String.valueOf(x);
            StringBuilder z=new StringBuilder(y);
            z.reverse();
            String a=new String(z);
            if (y.equals(a)){
                System.out.println(x+"是回文");
            }
            else {
                System.out.println(x+"不是回文");
            }
        }
        else {
            System.out.println("你输入的值超出范围（1-9999）");
        }
    }
}
