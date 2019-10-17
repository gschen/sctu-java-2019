package lab02.Test_11;

public class Rectangle implements Printx{
    Rectangle(){
        System.out.println("这是一个矩形");
    }

    int lenght;
    int width;
    private int area;
    private int perimeter;

    @Override
    public void printMyWay() {
        perimeter = (lenght + width)*2;
        area = lenght * width;
        System.out.println("长为："+lenght+"宽为："+width);
        System.out.println("周长为："+perimeter);
        System.out.println("面积为："+area);
    }
}