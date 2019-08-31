package day20190829;

public class Test2_3 {
    public static void main(String[] args) {
        byte a=120;
        short b=255;
        int c=2200;
        long d=2147483649L;
        float f1,f2;
        double g=0.1234567812345678;
        b=a;
        c=(int)d;
        f1=a;
        f2=(float)g;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("f1="+f1);
        System.out.println("f2="+f2);
        System.out.println("g="+g);
    }
}
