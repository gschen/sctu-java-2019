package lab02.test_12;

public class Test_12 {
    static class Shape{
        void sq(){

        }
        void C(){

        };
    }
    class Rectangular extends Shape{
        void sq(){}
        void C(){}

        class Circle{
            void sq(){}
            void  C(){}
        }
    }

    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.sq();
        shape.C();
    }
}
