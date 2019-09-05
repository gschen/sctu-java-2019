package lab_01;
import java.util.Scanner;

public class Text_07 {
    public static void main(String[] args) {
        int n=(int)(Math.random()*100);
        //接受从控制台的输入
        Scanner input=new Scanner(System.in);

        while (true){
            System.out.println("请输入成绩结果：");
            //接受对象n
            int guess=input.nextInt();

            if (guess !=n) {
                if (guess > n) {

                    System.out.println("猜大了");
                } else if (guess < n) {

                    System.out.println("猜小了");
                }
            }
            else{

                System.out.println("猜对了");
                break;
            }
        }
    }
}
