package lab_02.Test_12;

public class Rectangular extends Shape {
    void length(double slength, double width){
        System.out.println("周长： " + (slength + width) * 2);
    }
    void area(double slength, double width){
        System.out.println("面积： " + slength*width);
    }
}
