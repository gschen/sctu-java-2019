package lab02;

public class Test_02 {
    private static double r;

    private static double caclu(double r){
        return Math.PI*2*r;
    }
    private static double au(double r){
        Test_02.r = r;
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        double c = caclu(2.3);
        System.out.println("这个圆的周长为："+c);
        double a = au(2.5);
        System.out.println("这个圆的面积为："+a);
    }
}

