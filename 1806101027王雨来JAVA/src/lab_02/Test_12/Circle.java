package lab_02.Test_12;

public class Circle extends Shape{
    public Circle(double radius){
        this.radius = radius;
        this.acreage =Math.PI * radius * radius;
        this.perimeter = 2 * Math.PI * radius;
        System.out.println("Circle{" +
                ", acreage=" + acreage +
                ", perimeter=" + perimeter +
                ", radius=" + radius +
                '}');
    }

}
