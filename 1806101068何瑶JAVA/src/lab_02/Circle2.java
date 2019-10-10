package lab_02;

public class Circle2 {
    double radius,area;
    Circle2(double r){
        radius=r;
    }
    double getArea(){
        double pi=3.14;
        double area=pi*radius*radius;
        return area;
    }
    double getLength(){
        double pi=3.14;
        double length=pi*radius*2;
        return length;
    }
    void setRadius(double newRadius){
        radius=newRadius;
    }
    double getRadius(){
        return radius;
    }

    public static void main(String[] args) {
        Circle2 circle2=new Circle2(3);
        circle2.getLength();
        circle2.getArea();
        System.out.println("圆的周长为："+circle2.getLength());
        System.out.println("圆的面积为："+circle2.getArea());
    }
}
