package day20190829;
//功能：演示基本数据类型转换
//int型最大值=2147483647
//int型最小值=-2147483648

public class Test2_3 {
    public static void main(String[] args) {
        byte a=120;
        short b=255;
        int c=2200;
        long d=2147483649L;
        float f1,f2;
        double g=0.1234567812345678;
        b=a;//低精度赋值给高精度
        c=(int)d;//高精度强制转换赋值给低精度
        f1=a;//低精度赋值给高精度
        f2=(float)g;//高精度强制转换赋值给低精度
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("f1="+f1);
        System.out.println("f2="+f2);
        System.out.println("g="+g);

    }
}
