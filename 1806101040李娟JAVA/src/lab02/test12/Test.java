package lab02.test12;

//1）	定义一个图形类Shape，定义两个方法分别用来求面积和周长。（这两个方法的体内容应该为空）
//2）	定义图形类Shape的子类Rectangular类重写求面积及周长的功能
//3）	定义图形类Shape的子类Circle类重写求面积及周长的功能

class Shape{
    double radius=1;
    double area(){
        return radius;
    }

    double length(){
        return radius;
    }
}

class Rectangular extends Shape{
    double len=3;
    double kuan=4;
    double area(){
        return len * kuan;
    }

    double length(){
        return (len+kuan) * 2;
    }
}

class Circle extends Shape{
    double radius=3;
    double area(){
        return radius * radius * 3.14;
    }

    double length(){
        return radius  * 3.14 * 2;
    }
}

public class Test {
    public static void main(String[] args) {
        Shape s1=new Rectangular();
        Shape s2=new Circle();

        System.out.println(s1.area());
        System.out.println(s1.length());
        System.out.println(s2.area());
        System.out.println(s2.length());

    }
}
