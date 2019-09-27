package lab_02.test_06;

public class Circle {
    //1.属性
    //半径、周长、面积
    double banjing,zhouchang,mianji;
    Circle(double r){
        banjing=r;
        zhouchang=2*r*Math.PI;
        mianji=Math.PI*r*r;
    }
    //成员变量
    //返回周长、面积
    double getZhouChang()
    {
        return zhouchang;
    }
    double getMianJi()
    {
        return mianji;
    }

    public static void main(String[] args) {
        Circle d = new Circle(13);
        System.out.println("圆的周长为："+d.getZhouChang());
        Circle l = new Circle(14);
        System.out.println("圆的面积为："+l.getMianJi());
    }
}
