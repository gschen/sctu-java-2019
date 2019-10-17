package lab_02;

public class Test_02 {
    double radius;

   double calArea(){
       return this.radius*3.14*this.radius;
   }double calLength(){
       return this.radius*3.14*2;
   }

    public static void main(String[] args) {
        Test_02 Circle = new Test_02();
        Circle.radius = 5;

        Circle.calArea();
        Circle.calLength();
        System.out.println(Circle.calLength());
        System.out.println(Circle.calArea());
    }
}
