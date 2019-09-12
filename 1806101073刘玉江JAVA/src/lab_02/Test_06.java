package lab_02;

public class Test_06 {
    static class Triangle{
        private double side1;
        private double side2;
        private double side3;
        private double grith;
        private double area;


        public Triangle(double side1,double side2,double side3){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.grith = side1+side2+side3;
            this.area = Math.sqrt((side1+side2+side3)*(side1+side2-side3)*(side1+side3-side2)*(side2+side3-side1))/4;
        }
        public void print() {
            System.out.println("周长为：" + grith+",面积为"+area);
        }

    }

    public static void main(String[] args) {
        Triangle a = new Triangle(3,4,5);
        a.print();


    }



}
