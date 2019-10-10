package lab_02;

public class test_12 {
    public static void main(String[] args) {
        Rectangular rectangular=new Rectangular(5,6);
        rectangular.area();
        rectangular.perimeter();
        Circle2 circle2=new Circle2(5);
        circle2.area();
        circle2.perimeter();
    }
}
class Shape{
    //面积
    public void area(){

    }
    //周长
    public void perimeter(){

    }
}

class Rectangular extends Shape{
    double width;
    double height;
    public Rectangular(double width,double height){
        this.height=height;
        this.width=width;
    }
    public void area(){
        System.out.println(width*height);
    }
    public void perimeter(){
        System.out.println(2*(width+height));
    }
}
class Circle2 extends Shape{
    double r;
    public Circle2(double r){
        this.r=r;
    }
    public void area(){
        System.out.println(3.14*r*r);
    }
    public void perimeter(){
        System.out.println(2*3.14*r);
    }
}