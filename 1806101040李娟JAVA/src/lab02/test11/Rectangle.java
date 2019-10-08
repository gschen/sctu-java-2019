package lab02.test11;

//2)	编写矩形类Rectangle，矩形类要求实现Printx接口，有求面积、求周长的方法，printMyWay()方法要能显示矩形的边长、面积和周长。

public class Rectangle implements Printx{
    double a=1;
    double b=2;

    @Override
    public double area(double a, double b) {
        return a*b;
    }

    @Override
    public double len(double a, double b) {
        return 2*(a+b);
    }

    @Override
    public void printMyWay() {
        System.out.println("矩形的长："+this.a+"\n"+
                "矩形的宽："+this.b+"\n"+
                "矩形面积："+this.area(1,2)+"\n"+
                "矩形周长："+this.len(1,2)+"\n");
    }
}
