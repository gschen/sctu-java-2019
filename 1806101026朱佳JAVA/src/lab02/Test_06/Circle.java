package lab02.Test_06;

public class Circle {
    //1.属性 半径
    double radius;


    //2.方法
    //计算圆的面积和周长

    double calArea(){

        return 3.14* this.radius* this.radius;
    }

    double calLength(){
        return 2* 3.14* this.radius;
    }



    public static void main(String[] args) {
        Circle c1=new Circle();

        //赋值
        c1.radius=2;

        //调用
        c1.calArea();
        c1.calLength();

        System.out.println(c1.calArea());
        System.out.println(c1.calLength());
    }
}



