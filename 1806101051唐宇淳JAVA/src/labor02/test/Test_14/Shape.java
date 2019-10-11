package labor02.test.Test_14;

 abstract class Shape {
     public int x,y;
     public int width,height;
    public Shape(int x1,int y1,int width1,int height1){
        x = x1;y = y1;width = width1;height = height1;
    }
    abstract double getArea();
}
class Rectangle extends Shape{
    public Rectangle(int x1, int y1, int width1, int height1) {
        super(x1, y1, width1, height1);
    }
    @Override
    double getArea() {
        return (width*height) ;
    }
}
class   Circle extends Shape{
     public double r;

    public Circle(int x1, int y1, int width1, int height1) {
        super(x1, y1, width1, height1);
        r = (double)width/2.0;
    }

    @Override
    double getArea() {
        return (Math.PI*r*r);
    }
}
class Test{
    public static void main(String[] args) {
        Rectangle re = new Rectangle(1,4,5,7);
        Circle ci = new Circle(4,6,7,8);
        System.out.println("矩形的面积是："+re.getArea());
        System.out.println("圆的面积是："+ci.getArea());
}}
