package lab_02.Test_06;
//6、 	编写一个Java应用程序，该程序中有3个类：Triangle、Ladder和Circle，分别用来刻画“三角形”、“梯形”和“圆形”。具体要求如下：
//        1)	Triangle类具有类型为double的三个边，以及周长、面积属性，Triangle类具有返回周长、面积以及修改三个边的功能。另外，Triangle类
//        还具有一个Boolean型的属性，该属性用来判断三个属能否构成一个三角形。
//        2)	Ladder类具有类型double的上底、下底、高、面积属性，具有返回面积的功能。
//        3)	Circle类具有类型为double的半径、周长和面积属性，具有返回周长、面积的功能。

public class Traingle {
    private double sideA,sideB,sideC;
    private double grith;
    private double area;
    private boolean flag;

    public Traingle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getGrith() {
        return grith;
    }

    public double getArea() {
        return area;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public boolean judge(){
        if(sideA + sideB > sideC && sideA + sideC > sideB && sideB +sideC > sideA){
            return flag = true;
        }else {
            return flag = false;
        }
    }

    public double area(){
        double p = (sideA + sideB + sideC)/2;
        double s = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        area = s;
        return s;
    }

    public  double grith(){
        grith = sideC + sideB + sideA;
        return sideC + sideB + sideA;
    }
}
