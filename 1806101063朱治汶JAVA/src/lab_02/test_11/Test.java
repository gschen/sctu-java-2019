package lab_02.test_11;

public class Test {
    public static void main(String[] args) {

        //测试矩形类
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2;
        rectangle.lenght = 4;
        rectangle.printMyWay();


        //测试正方形类
        Square square = new Square();
        square.lenght = 3;
        square.width = 3;
        square.getDiagonal();
        square.printMyWay();
    }
}
