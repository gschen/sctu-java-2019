package lab_02.Test_02;

import java.util.Scanner;

public class Test_02 {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        Scanner input=new Scanner(System.in);
        float r=input.nextFloat() ;
        Circular c=new Circular();
        c.area(r);
        c.perimeter(r) ;
    }


}

class Circular{
    private float r;

    public void perimeter(float r){
        //周长等于3.14*2*r
        System.out.println("周长为"+(3.14*2*r));
    }

    public void area(float r){
        //面积等于3.14*r*r
        System.out.println("面积为"+(3.14*r*r));
    }

}





