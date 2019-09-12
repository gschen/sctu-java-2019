package lab_02.test_05;

//5、 	编程创建一个立方体类，在其中定义三个变量表示一个立方体的长、宽和高，再定义一个方法对这三个变量进行初始化，
// 然后定义一个方法求立方体的体积。创建一个对象，求给定尺寸的立方体的体积。

public class Cube {
    //1.成员变量
    //长、宽、高
    double length;
    double width;
    double height;

    //2.成员方法
    //求体积
    Cube(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
        System.out.println("立方体体积为"+this.length*this.width*this.height);
    }

    public static void main(String[] args) {
        Cube a=new Cube(3,4,5);
        Cube b=new Cube(5,6,7);
        Cube c=new Cube(7,8,9);
    }
}
