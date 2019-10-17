package lab02.Test_02;

import java.lang.Math;
public class Test_02_1 {
    double radius;

   void  Callength(){
       System.out.println( Math.PI*2*radius);

    }

    public static void main(String[] args) {
        Test_02_1 C= new Test_02_1();
        C.radius=8;
        C.Callength();

    }

}
