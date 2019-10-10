package lab_02.test_06;

public class Main {
    public static void main(String[] args) {
        double s,c;
        Circle circle=null;
        Triangle triangle;
        Ladder ladder;


        //赋值 定义成员变量
        Triangle tt=new Triangle(3,4,5);
        Ladder ll=new Ladder(3,4,5);
        Circle cc=new Circle(2);

        //运行结果
        c=tt.getC();
        System.out.println("三角形的周长"+c);
        s=tt.getS();
        System.out.println("三角形的面积"+s);

        s=ll.getS();
        System.out.println("梯形的面积"+s);

        c=cc.getC();
        System.out.println("圆的周长"+c);
        s=cc.getS();
        System.out.println("圆的面积"+s);


    }
}
