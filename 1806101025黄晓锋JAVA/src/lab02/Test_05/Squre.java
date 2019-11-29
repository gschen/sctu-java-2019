package lab02.Test_05;

import java.util.Scanner;

public class Squre {
    float chang;
    float kuan;
    float gao;
    float tiji = chang * kuan * gao ;

    void box(float chang,float kuan, float gao){
        this.chang = chang;
        this.kuan = kuan;
        this.gao = gao;
    }

    double size () {return chang * kuan *gao; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入长度：");
        float chang = sc.nextFloat();
        System.out.print("请输入宽度：");
        float kuan = sc.nextFloat();
        System.out.print("请输入高度：");
        float gao = sc.nextFloat();

        Squre squre = new Squre();
        squre.box( chang, kuan, gao );
        System.out.println("立方体体积为：" + squre.size());
    }
}
