package lab02;

//5、 	编程创建一个立方体类，在其中定义三个变量表示一个立方体的长、宽和高，
// 再定义一个方法对这三个变量进行初始化，然后定义一个方法求立方体的体积。创建一个对象，求给定尺寸的立方体的体积。

public class Test_05 {

    double chang;
    double width;
    double height;

    double volume(){
        return this.chang *this.width *this.height;
    }

    public static void main(String[] args) {
        Test_05 c1=new Test_05();

        c1.chang=3;
        c1.width=5;
        c1.height=2;

        c1.volume();

        System.out.println(c1.volume());
    }
}