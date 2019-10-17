package lab_02.Test_11;

public class Rectangle implements Printx{
    double width;
    double height;

    double area(){
        return width*height;
    }
    double langth(){
        return (width+height)*2;
    }
    @Override
    public void printMyWay() {
        System.out.println("面积为："+ area());
        System.out.println("周长为："+ langth());
        System.out.println("长为:"+width);
        System.out.println("宽为:"+height);

    }
}
