package lab02.Test_05;
//5、 	编程创建一个立方体类，在其中定义三个变量表示一个立方体的长、宽和高，再定义一个方法对这三个变量进行初始化，然后定义一个方法求立方体的体积。创建一个对象，求给定尺寸的立方体的体积。
public class Square {
    //1. 属性
        private double length;
        private double width;
        private double height;
    //2. 行为
    //计算体积
    double volume(){
        return this.length * this.width * this.height;
    }

    public static void main(String[] args) {
    Square v = new Square();
    v.height = 3;
    v.width = 4;
    v.length = 5;
        System.out.println(
                "立方体的体积为：" + v.volume()
        );

    }
}
