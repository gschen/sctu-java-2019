package lab_02;

import javafx.scene.shape.Circle;

public class Test_02 {
    static class Circle{
        private double r;
        private double c;
        private double s;



        public Circle(double r){
            this.r = r;

            c=3.14*2*r;
            s=3.14*r*r;

        }
        public void print(){
            System.out.println("当周长为："+this.r+"时,"+"面积大约为："+this.s+"周长大约为："+this.c);
        }
    }

    public static void main(String[] args) {
        Circle a = new Circle(5);
        a.print();

    }

}
