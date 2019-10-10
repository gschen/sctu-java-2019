package lab_02;

public abstract class Test_16 {
    public abstract double A(double a,double b);
}
 class addextends extends Test_16 {
     public double A(double a, double b) {
         return a + b;
     }
 }
 class subextends extends Test_16 {
     public double A(double a, double b) {
         return a - b;
     }
 }
class mulextends extends Test_16 {
    public double A(double a, double b) {
        return a * b;
    }
}
class divextends extends Test_16 {
    public double A(double a, double b) {
        return a / b;
    }
}
class Mainx{
    public static void main(String[] args) {
        addextends h1=new addextends();
        subextends h2=new subextends();
        mulextends h3=new mulextends();
        divextends h4=new divextends();
        System.out.println("1+2="+h1.A(1,2)+"2-1="+h2.A(2,1)+"2*3="+h3.A(2,3)+"4/2="+h4.A(4,2));
    }
}