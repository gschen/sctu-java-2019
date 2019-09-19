package practice.fangfachongzai;

class A{
    double area(double radius){
        return radius*2;
    }
}

class B extends A{
    double area(double radius){
        return radius*3;
    }
}

public class Fugai {
    public static void main(String[] args) {
        A a=new B(); //对A里的方法重写
        B b=new B();

        double radius=2;

        System.out.println(a.area(radius));
        System.out.println(b.area(radius));
    }
}
