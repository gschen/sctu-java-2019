package lab_02;

public class Test_05 {
    private double length;
    private double width;
    private double height;
    //计算长方体的体积
    double volume(){
        return this.length * this.width * this.height;
    }
    public static void main(String[] args) {
        Test_05 b = new Test_05();
        b.length = 3;
        b.width = 4;
        b.height = 5;
        System.out.println("立方体 b 的体积是 " + b.volume());
    }
}
