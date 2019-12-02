package lab_02.Test_11;

public class Square implements Printx{
    double length;
    double acreage;
    double perimeter;
    public Square(double length){
        this.length = length;
        this.acreage = length * length;
        this.perimeter = 4 * length;
    }

    public void printMyWay() {
        System.out.println("Square{" +
                ", length=" + length +
                ", acreage=" + acreage +
                ", perimeter=" + perimeter +
                '}');
    }
}
