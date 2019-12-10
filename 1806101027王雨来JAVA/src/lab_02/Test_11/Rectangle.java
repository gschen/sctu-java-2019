package lab_02.Test_11;
/*11、 	按下述要求实现程序：
    1)	定义接口Printx，其中包括一个方法printMyWay()，这个方法没有形参，返回值为空。
    2)	编写矩形类Rectangle，矩形类要求实现Printx接口，有求面积、求周长的方法，
        printMyWay()方法要能显示矩形的边长、面积和周长。
    3)	编写正方形类作为矩形类的子类，正方形类继承了矩形类求面积和周长的方法，新增加求对角线长的方法，
        重写printMyWay()方法，要求该方法能显示正方形的边长、面积、周长和对角线长。
*/
public class Rectangle implements Printx{
    double width;
    double length;
    double acreage;
    double perimeter;
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
        this.acreage = width * length;
        this.perimeter = 2 * (width + length);
    }

    public void printMyWay() {
        System.out.println("Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", acreage=" + acreage +
                ", perimeter=" + perimeter +
                '}');
    }
}
