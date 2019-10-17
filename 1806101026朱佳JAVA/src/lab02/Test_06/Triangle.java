package lab02.Test_06;

import java.util.Scanner;
//导入数学类计算面积
import java.math.*;
public class Triangle {
    public static void main(String[]args) {
        double a,b,c,d,e,f,p,s;
        System.out.println("请输入该三角形的三条边长：");
        Scanner input=new Scanner(System.in);
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        d=a+b;
        e=a+c;
        f=b+c;
        p=(a+b+c)/2;
        //判断三角形是否构成，构不成则循环输入，否则跳出循环
        while(d<=c||e<=b||f<=a) {
            System.out.println("无法构成三角形，请重新输入");
            a=input.nextDouble();
            b=input.nextDouble();
            c=input.nextDouble();
            d=a+b;
            e=a+c;
            f=b+c;

        }
        s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("可以构成三角形");
        System.out.println("该三角形的周长为："+(a+b+c));
        System.out.println("该三角形的面积为："+s);
    }
}

