package lab_02.test_05;

import java.util.Scanner;

public class Cube {
    //定义变量
    int length,width,height;

    //定义一个方法变量初始化

    public void setCube(int l,int w, int h){
        Scanner in=new Scanner(System.in);//使用Scanner类定义对象
        length=l;
        width=w;
        height=h;

    }
    public int volume(){   //定义一个方法求立方体体积
        return length*width*height;
    }

    public static void main(String[] args) {
        int v;

        Cube cu=new Cube();
        cu.height=5;
        cu.width=10;
        cu.length=10;
        v=cu.volume();
        System.out.println("体积为"+v);

    }
}
