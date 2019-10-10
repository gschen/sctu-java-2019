package lab_02.Test_11;

public class Test_11 {
    public static void main(String[] args) {
        Square square=new Square(5,5);
        square.printMyWay();
        square.diagonal();

    }
}
class Rectangle implements Printx {
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public void printMyWay() {
        System.out.println("边长分别为："+length+"、"+width+"的矩形");
        System.out.println("面积为："+length*width);
        System.out.println("周长为："+2*(length+width));
    }
}

class Square extends Rectangle{
    double d;
    public Square(double length,double width){
        super(length,width);//调用父类
    }
    public void diagonal(){
        d=Math.sqrt(length*length+width*width);
        System.out.println("对角线长为："+d);
    }

}
