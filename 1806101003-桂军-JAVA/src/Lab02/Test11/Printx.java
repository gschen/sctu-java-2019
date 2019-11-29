package Lab02.Test11;

public interface Printx {
    void printMyWay();
}

class Rectangle implements Printx {
    double a,b,area,length;
    Rectangle(double a,double b)
    {
        this.a=a;
        this.b=b;
    }
    double getArea(){
        area=a*b;
        return area;
    }
    double getLength(){
        length=(a+b)*2;
        return length;
    }
    @Override
    public void printMyWay(){
        System.out.println("矩形长为："+a);
        System.out.println("矩形宽为："+b);
        System.out.println("矩形面积为："+getArea());
        System.out.println("矩形周长为："+getLength());

    }
}
class square extends Rectangle {
    square(double a, double b) {
        super(a, b);
    }

    @Override
    double getArea() {
        return super.getArea();
    }

    @Override
    double getLength() {
        return getLength();
    }

    double diagonal() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public void printMyWay() {
        System.out.println("正方形的边长为：" + a);
        System.out.println("正方形的面积为：" + getArea());
        System.out.println("正方形的周长为：" + getLength());
        System.out.println("正方形的对角线为：" + diagonal());
    }
}
class Javahomework{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5,9);
        square s=new square(4,4);
        r.printMyWay();
        s.printMyWay();

    }
}
