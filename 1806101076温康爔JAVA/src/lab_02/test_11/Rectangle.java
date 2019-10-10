package lab_02.test_11;

public class Rectangle implements Printx {//implements接口实现方法
   // @Override
    //public void printMyway() {}

        double length;
        double width;
        Rectangle(double x,double y){
            length=x;
            width=y;
    }
    public void printMyway(){
        System.out.println("边长分别为："+length+"、"+width+"的矩形");
        System.out.println("面积为："+length*width);
        System.out.println("周长为："+2*(length+width));
    }
}
