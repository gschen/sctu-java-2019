package day20190919.test_11;

public class test_11 {
    public static void main(String[] args) {
        Rectangle a=new Rectangle(12,15);
        a.printMyWay();
    }
}

class Rectangle implements Printx{
    double width;
    double high;
    double area;
    double zc;
    Rectangle(double width,double high){
        this.width=width;
        this.high=high;
    };
    double getArea(){
        area=width*high;
        return area;
    }
    double getZc(){
        zc=2*(width+high);
        return zc;
    };
    public void printMyWay(){
        System.out.println("宽："+width+"   高："+high+"   面积："+getArea()+"   周长："+getZc());
    };
};