package lab_02.Test_12;

public class Rectangle extends Shape{

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.acreage = width * length;
        this.perimeter = 2 * (width + length);
        System.out.println("Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", acreage=" + acreage +
                ", perimeter=" + perimeter +
                '}');
    }
}
