package lab_02.test_06;

public class Ladder {

    //属性
    double above,bottom,height,s;

    public Ladder(double a,double b, double c){
        above=a;
        bottom=b;
        height=c;
    }

    public double getS() {
        s=(above+bottom)*height/2;
        return s;
    }
}
