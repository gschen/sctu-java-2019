package lab02.Test_12;
public class Shape {
    void area(){
    }
    void length(){
    }
}
class Rectangular extends Shape{
    void arae(){
        System.out.println("长方形的面积");
    }
    void length(){
        System.out.println("长方形的周长");
    }
}
class Circle4 extends Shape{
    void area(){
        System.out.println("圆的面积");
    }
    void length(){
        System.out.println("圆的周长");
    }
}
class Main{
    public static void main(String[] args) {
        Shape a;
        Rectangular b=new Rectangular();
        Circle4 c=new Circle4();
        a=b;
        a.area();
        a.length();
        a=c;
        a.area();
        a.length();
    }

}
