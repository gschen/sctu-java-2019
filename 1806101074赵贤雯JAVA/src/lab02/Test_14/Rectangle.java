package lab02.Test_14;

public class Rectangle extends Shape {

        double length;

        double width;

        double getArea() {

            return length * width;
        }

        void setLenWid(double Length, double Width) {
            length = Length;
            width = Width;
        }
    }

