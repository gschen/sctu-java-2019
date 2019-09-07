package Week02;

public class T2 {
}
    private double Bj;
    private static double Pi=3.1415;

    public double getBj() {
        return Bj;
    }

    public void setBj(double bj) {
        Bj = bj;
    }

    public double getPi() {
        return Pi;
    }

    public static double zhouChang(double bj)
    {
        double result;
        result = 2 * Pi * bj;
        return result;
    }
    public static double Area(double bj)
    {
        double result;
        result = Pi * bj*bj;
        return result;
    }
    public static void main(String[] args)
    {
        System.out.println(zhouChang(4));

    }

}