package lab_02.Test_12;

import day20190927.C;

public class Circle extends Shape{
    double PI = 3.14;
    double r;
    public void area(){
        System.out.println(PI*r*r);

    }

    public void Super_area(){
        super.area();
    }

    public void length(){
        System.out.println(PI*r*2);
    }
    public void Super_length(){
        super.length();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.r = 2;
        circle.area();
        circle.length();
    }
}
