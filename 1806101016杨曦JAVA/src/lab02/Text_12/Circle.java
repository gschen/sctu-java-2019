package lab02.Text_12;

public class Circle extends Shape{
    void  area(){
        System.out.println("圆的面积");
    }
    void length(){
        System.out.println("圆的周长");
    }
}
    class Main {
    public static void main(String args[]){
        Shape a;
        Rectangular b=new Rectangular();
        Circle c=new Circle();
        a=b;
        a.area();
        a.length();
        a=c;
        a.area();
        a.length();
    }


}
