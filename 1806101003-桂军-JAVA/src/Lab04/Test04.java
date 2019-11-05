package Lab04;

import java.util.Scanner;
public class Test04 {

    public static void main(String[] args) {
        Test t=new Test();
        Thread th=new Thread(t);
        th.start();
    }
}
class Test implements Runnable {
    public void run() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println(i);
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}