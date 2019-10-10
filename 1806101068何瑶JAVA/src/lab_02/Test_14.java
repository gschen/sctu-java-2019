package lab_02;

abstract class Test_14 {
    double radius,length,width,height;
    abstract double getArea();
    Test_14(double r,double h){
        radius=r;
        height=h;
    }
    Test_14(double l,double w,double h){
        length=l;
        width=w;
        height=h;
    }
}
class Circle5 extends Test_14{
    Circle5(double r,double h){
        super(r,h);
    }
    double getArea(){
        return (3.14*radius*radius*2+2*3.14*radius*height);
    }
}
class Rectangle1 extends Test_14{
    Rectangle1(double l,double w,double h){
        super(l,w,h);
    }
    double getArea(){
        return ((length*width+length*height+width*height)*2);
    }
}
class aaa{
    public static void main(String[] args) {
        Circle5 c=new Circle5(2,3 );
        Rectangle1 r=new Rectangle1(3,2,4);
        System.out.println("圆柱体体积="+c.getArea());
        }
    }
