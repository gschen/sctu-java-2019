package lab_02;

public class Test_16 {
    public static void main(String[] args) {
        Add add=new Add();
        Reduce reduce=new Reduce();
        Ride ride=new Ride();
        Except except=new Except();
        System.out.println(add.op(2,3));
        System.out.println(reduce.op(6,3));
        System.out.println(ride.op(2,3));
        System.out.println(except.op(6,3));


    }
}
abstract class A{
    abstract double op(double a,double b);
}
class Add extends A{

    @Override
    double op(double a, double b) {
        return a+b;
    }
}
class Reduce extends A{   //减法

    @Override
    double op(double a, double b) {
        return a-b;
    }
}
class Ride extends A{  //乘法

    @Override
    double op(double a, double b) {
        return a*b;
    }
}
class Except extends A{  //除法

    @Override
    double op(double a, double b) {
        return a/b;
    }
}