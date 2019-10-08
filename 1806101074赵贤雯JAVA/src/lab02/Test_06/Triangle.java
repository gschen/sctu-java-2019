package lab02.Test_06;
//6、 	编写一个Java应用程序，该程序中有3个类：Triangle、Ladder和Circle，分别用来刻画“三角形”、“梯形”和“圆形”。具体要求如下：
//1)			Triangle类具有类型为double的三个边，以及周长、面积属性，Triangle类具有返回周长、面积以及修改三个边的功能。另外，Triangle类还具有一个Boolean型的属性，该属性用来判断三个属能否构成一个三角形。

public class Triangle {
    double line1;
    double line2;
    double line3;
    boolean Tri;

    public Triangle(double line1, double line2, double line3, boolean Tri) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        if (line1 + line2 > line3 && Math.abs(line1 - line2) < line3) {
            this.Tri = true;
        } else this.Tri = false;
    }

    @Override
    public String toString() {
        return "Triangle{" + "line1 = " + line1 + ", line2 = " + line2 + ", line3 = " + line3 + ", Tri = " + Tri + "}";
    }
}

class Mian1{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,7,3,false);
        System.out.println(triangle);
    }
}



