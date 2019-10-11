package lab_02.Test_11;
import java.lang.Math;
public class Square extends Rectangle{
    void diagonal(double slength, double diaonal){
        diaonal = Math.sqrt(slength*slength + slength*slength);
    }
    public void printMyWay(double length, double area){
        System.out.println("周长: " + length + "\n" + "面积： " + area);
    }
}
