package lab_02.text_02;

public class Circle {
    //1.属性
    private double radius;


    //2.成员方法
    //计算圆的面积和周长
    private double calArea(){
        return 3.14*this.radius*this.radius;
    }

    private double calLength(){
        return 2*3.14*this.radius;
    }

    private void print(){
        //获取前面定义的成员变量
        System.out.println("圆的面积和周长是："+this.calArea()+"和"+this.calLength());
    }

    public static void main(String[] args) {

        Circle c1=new Circle();
        c1.radius=1;

        double area = c1.calArea();
        double length = c1.calLength();
        c1.print();
    }


}
