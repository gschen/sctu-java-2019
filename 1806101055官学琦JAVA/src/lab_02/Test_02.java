package lab_02;

import java.util.Scanner;

public class Test_02 {
    public static void main(String[] args) {
        Test_02 r=new Test_02();
        r.Area();
        r.Perimeter();
    }

    Scanner input=new Scanner(System.in);
    double r=input.nextDouble();
    //求周长
    public void Perimeter(){
        System.out.println(this.r*2*3.14);
    }
    //求面积
    public void Area(){
        System.out.println(this.r*this.r*3.14);
    }
}







