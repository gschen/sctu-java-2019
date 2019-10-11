package lab_02.Test_12;

public class Circle extends Shape {
    void length(double raduis){
        System.out.println("周长： " + 2 * 3.14 * raduis);
    }
    void area(double raduis){
        System.out.println("面积： " + 3.14 * raduis * raduis);
    }
}
