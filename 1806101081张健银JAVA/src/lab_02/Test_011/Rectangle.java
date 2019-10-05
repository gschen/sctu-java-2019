package lab_02.Test_011;
//1)	定义接口Printx，其中包括一个方法printMyWay()，这个方法没有形参，返回值为空。
//        2)	编写矩形类Rectangle，矩形类要求实现Printx接口，有求面积、求周长的方法，printMyWay()方法要能显示矩形的边长、面积和周长。
//        3)	编写正方形类作为矩形类的子类，正方形类继承了矩形类求面积和周长的方法，新增加求对角线长的方法，重写printMyWay()方法，要求该方法能显示正方形的边长、面积、周长和对角线长。

public class Rectangle implements Printx{

    private int width;
    private int length;
    public  Rectangle(){}

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int area(){
        int area = width * length;
        return area;
    }

    public int grith(){
        int grith = (width + length) * 2;
        return grith;
    }
    @Override
    public void printMyWay() {
        System.out.println("矩形长为：" + length + "矩形宽为："  + width + "矩形面积：" + area() + "矩形周长：" + grith());
    }
}
