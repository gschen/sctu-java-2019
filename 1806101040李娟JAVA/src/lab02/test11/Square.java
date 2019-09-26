package lab02.test11;

//1)	定义接口Printx，其中包括一个方法printMyWay()，这个方法没有形参，返回值为空。
//2)	编写矩形类Rectangle，矩形类要求实现Printx接口，有求面积、求周长的方法，printMyWay()方法要能显示矩形的边长、面积和周长。
//3)	编写正方形类作为矩形类的子类，正方形类继承了矩形类求面积和周长的方法，新增加求对角线长的方法，重写printMyWay()方法，
// 要求该方法能显示正方形的边长、面积、周长和对角线长。


public class Square  extends Rectangle{
    double a=2;
    double b=2;
    double dui(double a,double b){
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public void printMyWay() {
        System.out.println("正方形的边长："+this.a+"\n"+
                "正方形面积："+this.area(2,2)+"\n"+
                "正方形周长："+this.len(2,2)+"\n"+
                "正方形对角线长："+this.dui(2,2));
    }
}
