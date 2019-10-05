package lab_02;


public class Circle1 {
    //1.属性
    double radius;

    //2.成员方法
    //计算圆的的面积与周长
    double calArea(){
        return  3.14*this.radius*this.radius;
    }
    double calLength(){
        return 3.14*2*this.radius;
    }

    public static void main(String[] args) {
        Circle1 c1=new Circle1();
        c1.radius=1;
        c1.calArea();
        c1.calLength();
        System.out.println("圆的面积为："+c1.calArea()+"\n"+
                "圆的周长为："+c1.calLength());
    }
}
