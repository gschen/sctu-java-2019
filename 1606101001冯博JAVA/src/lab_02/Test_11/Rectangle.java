package lab_02.Test_11;

public class Rectangle implements Printx{
    void area(double length, double width,double area){
        area = length*width;
        System.out.println("矩形面积为：" + area );
    }
    void perimeter(double length, double width,double perimeter){
        perimeter = (length + width)*2;
        System.out.println("周长为： " + perimeter);
    }
    @Override
    public void printMyWay(double length, double width) {
        System.out.println("矩形的长： " + length + "\n" +
                                    "宽: " + width + "\n");
    }
}
