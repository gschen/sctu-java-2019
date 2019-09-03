package week01;
import java.util.Scanner;
public class Text2__13  {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            double []arr = new double[3];
            int count =0;
            for (double x =-100;x<100;x++){
                if (a*x*x*x+b*x*x+c*x+d == 0){
                    arr[count++] = x;
                }
            }
            if(Math.abs(arr[2]-arr[1])>=1&&Math.abs(arr[2]-arr[0])>=1&&
                    Math.abs(arr[2]-arr[0])>=1){
                for (int i = 0;i<3;i++){
                    System.out.printf("%.2f ",arr[i]);
                }
            }
        }
    }

