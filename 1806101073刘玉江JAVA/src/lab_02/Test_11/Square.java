package lab_02.Test_11;

public class Square extends Rectangle {
    double d;
    Square(double x,double y){
        super(x,y);
    }
    public void lin(){
        d = Math.sqrt(lenth*lenth+width*width);
        System.out.println("对角线是："+d);
    }


}
class Testclass{
    public static void main(String[] args) {
        Rectangle c = new  Rectangle(6,8);
        System.out.println(c.getClass().getName()+"矩形");
        c.printMyWay();
        Square d = new Square(5,5);
        System.out.println(d.getClass().getName()+"正方形");
        d.printMyWay();
        d.lin();
    }
}
