package lab_02.Test_06;
//        2)	Ladder类具有类型double的上底、下底、高、面积属性，具有返回面积的功能。
public class Ladder {
    private double top;
    private double bottom;
    private double height;
    private double area;

    public Ladder(double top,double bottom,double height){
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    public double area(){
        return ((top + bottom)*height)/2;
    }
}
