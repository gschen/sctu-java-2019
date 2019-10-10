package lab_02.Test_06;
/*
6、 	编写一个Java应用程序，该程序中有3个类：
Triangle、Ladder和Circle，
分别用来刻画“三角形”、“梯形”和“圆形”。具体要求如下：

1)Triangle类具有类型为double的三个边，以及周长、面积属性，
Triangle类具有返回周长、面积以及修改三个边的功能。
另外，Triangle类还具有一个Boolean型的属性，
该属性用来判断三个属能否构成一个三角形。
*/

public class Triangle {
    double l1;
    double l2;
    double l3;
    boolean Tri;

    public Triangle(double l1, double l2, double l3, boolean Tri){
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        if (l1 + l2 > l3 && Math.abs(l1 - l2) < l3){
            this.Tri = true;
        }else this.Tri = false;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "l1=" + l1 +
                ", l2=" + l2 +
                ", l3=" + l3 +
                ", Tri=" + Tri +
                '}';
    }
}


class Mian{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,5,3,false);
        System.out.println(triangle);
    }
}