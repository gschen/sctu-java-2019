package day20190912;
import java.math.*;
public class GeometricFigure
{



    public static void main(String[] args) {
        Triangle a=new Triangle(3,4,5);//三角形
        a.judge();
        a.getTrianglePerimeter();
        a.getTriangleArea();

        Ladder b=new Ladder(3,4,5);//梯形
        b.getLadderArea();

        Circle c=new Circle(7);//圆
        c.getCirclePerimeter();
        c.getCircleArea();
    }


}
        class Triangle{
            private double edgeOne;
            private double edgeTwo;
            private double edgeThree;
            private double perimeter;
            private double area;
            Triangle(double edgeOne,double edgeTwo,double edgeThree){
                this.edgeOne=edgeOne;
                this.edgeTwo=edgeTwo;
                this.edgeThree=edgeThree;
            };
            double getTrianglePerimeter(){
                perimeter=edgeOne+edgeTwo+edgeThree;
                this.perimeter=perimeter;
                System.out.println("triangle周长为："+perimeter);
                return perimeter;
            };
            double getTriangleArea(){
                perimeter=edgeOne+edgeTwo+edgeThree;
                area=Math.sqrt(perimeter*(perimeter-edgeOne)*(perimeter-edgeTwo)*(perimeter-edgeThree));
                System.out.println("triangle面积为："+area);
                return area;
            };
            boolean judge(){//判断是否可以构成三角形
                if (edgeOne+edgeTwo>edgeThree&&edgeOne+edgeThree>edgeTwo&&edgeThree+edgeTwo>edgeOne){
                    System.out.println("可以构成三角形");return true;
                }else {System.out.println("不可以构成三角形");return false;}

            };
        };

        class Ladder{
            private double upper;//上底
            private double lower;//下底
            private double high;//高
            private double area;
            Ladder(double upper,double lower,double high){
                this.upper=upper;
                this.lower=lower;
                this.high=high;

            };
            double getLadderArea(){
                area=(upper+lower)*high/2;
                System.out.println("Ladder面积为："+area);
                return area;
            };
        }
        class Circle{
            private double radius;
            private double perimeter;
            private double area;

            Circle(double radius){
                this.radius=radius;
            };
            double getCirclePerimeter(){
                perimeter=2*radius*3.14;
                System.out.println("Circle的周长："+perimeter);
                return perimeter;
            };
            double getCircleArea(){
                area=3.14*radius*radius;
                System.out.println("Circle的面积："+area);
                return area;
            };
        };