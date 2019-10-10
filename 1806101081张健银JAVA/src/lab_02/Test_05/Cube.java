package lab_02.Test_05;
//5、 	编程创建一个立方体类，在其中定义三个变量表示一个立方体的长、宽和高，再定义一个方法对这三个变量进行初始化，
//        然后定义一个方法求立方体的体积。创建一个对象，求给定尺寸的立方体的体积。
public class Cube {
    private double lenth;
    private double width;
    private double height;
    public Cube(double lenth,double width,double height){
        this.height = height;
        this.width = width;
        this.lenth = lenth;
    }

    public double volume(){
        return height * width * lenth;
    }
}
