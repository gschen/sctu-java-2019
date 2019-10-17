package Lab_02.Test_12;


public class Rectangular extends Shape {
    private int width;
    private int length;

    public Rectangular(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("面积为:"+ width * length);

    }

    @Override
    public void grith() {
        System.out.println("周长为：" +(width + length ) * 2);
    }
}
