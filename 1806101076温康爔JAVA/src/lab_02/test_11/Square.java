package lab_02.test_11;

public class Square extends Rectangle {
    double d;
    Square(double x, double y) {
        super(x, y);
    }
    public void diagonal(){
        d=Math.sqrt(length*length+width*width);
        System.out.println("对角线长为："+d);
    }
}
