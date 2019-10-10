package lab_02.test_05;

import java.util.Scanner;

public class Cube {
    float hight;
    float widht;
    float length;

    void box(float hight,float widht,float length){
        this.hight = hight ;
        this.widht = widht;
        this.length = length;
    }
    double size(){
        return hight*widht*length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入高度：");
        float hig = sc.nextFloat();
        System.out.print("请输入宽度：");
        float wid = sc.nextFloat();
        System.out.print("请输入长度：");
        float len = sc.nextFloat();

        Cube cube = new Cube();
        cube.box( hig , wid , len );
        System.out.println("立方体的体积为："+cube.size());

    }
}
