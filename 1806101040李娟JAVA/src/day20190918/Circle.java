package day20190918;

 public class Circle {
    public int a;
    protected  int b;
    private int c;

    double add(){
        return this.a+ this.b + this.c;
    }

    public static void main(String[] args) {
        Circle c2=new Cube();
        c2.a=3;
        c2.b=4;
        c2.c=5;

        System.out.println(c2.add());
    }
}

class Cube extends Circle{
    double add(){
        return this.a+ this.b ;  // 没有this.c是因为 它是Circle 类独有的 就算是继承关系也不能访问
    }
}
