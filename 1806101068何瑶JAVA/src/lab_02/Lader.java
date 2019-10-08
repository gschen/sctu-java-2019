package lab_02;

public class Lader {
    double above,bottom,height,area;
    Lader(double a,double b,double h){
        above=a;
        bottom=b;
        height=h;
    }
    double getArea(){
        double area=(above+bottom)*height/2;
        return area;
    }

    public static void main(String[] args) {
        Lader lader=new Lader(2,3,4);
        lader.getArea();
        System.out.println("梯形的面积为："+lader.getArea());
    }
}
