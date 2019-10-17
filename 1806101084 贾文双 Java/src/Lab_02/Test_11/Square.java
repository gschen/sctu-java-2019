package Lab_02.Test_11;
//    3)	编写正方形类作为矩形类的子类，正方形类继承了矩形类求面积和周长的方法，新增加求对角线长的方法，重写printMyWay()方法，要求该方法能显示正方形的边长、面积、周长和对角线长。
public class Square extends Rectangle{
    private int side;

    public Square(int side){
        this.side = side;
    }
    public double line(){
        return Math.sqrt((side *side) + (side * side));
    }

    @Override
    public int area() {
        return side * side;
    }

    @Override
    public int grith() {
        return side * 4;
    }

    @Override
    public void printMyWay() {
        System.out.println("边长：" + side + ' ' + "面积：" + area() + ' ' + "周长：" + grith()+ ' ' + "边长" + line());
    }
}
