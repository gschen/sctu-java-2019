package labor02.test.Test_12;

 class Shape {
     public float a,b,r;
     void getS(){}
     void getC(){}
     public Shape(float a, float b){
         System.out.println("矩形面积是："+a*b+"矩形周长是："+2*(a+b));
         System.out.println("圆面积是："+Math.PI*r*r+"圆周长是："+2*Math.PI);
         this.a =a;this.b =b;this.r = r;
     }
}
class Rectangle extends Shape{
    public Rectangle(float a, float b) {
        super(a, b);
    }

    public void getS(){
        System.out.println("矩形的面积是："+a*b);
}
    public void getC(){
        System.out.println("\t"+"矩形的周长是："+2*(a+b));
    }
}
class Circle extends Shape{
    public Circle(float r){
         super(3,4);
     }public void getS(){
        System.out.println("圆的面积是："+Math.PI*r*r);
    }
    public void getC(){
        System.out.println("圆形的周长是："+2*Math.PI*r);
    }
}

class Test{
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(3,4);
        Circle cr = new Circle(4);
    }
}
