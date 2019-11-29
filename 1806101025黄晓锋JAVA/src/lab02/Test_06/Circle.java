package lab02.Test_06;

public class Circle {
    double r;
    double area;
    double perimeter;

    void getr(int r){
        this.r = r;
    }

    void getArea(){
        area = Math.PI*r*r;
        System.out.println("圆的面积为："+ area);
    }
    void getPerimeter(){
        perimeter = 2*Math.PI*r;
        System.out.println("圆的周长为："+perimeter);
    }

}
