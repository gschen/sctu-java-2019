package lab_02;

public class Test_13 {
    public static void main(String[] args) {
        double []data=new double[6];
        for (int i = 0; i <6 ; i++) {
            data[i]=i;
        }
        Gymnastics gymnastics=new Gymnastics(data);
        System.out.println(gymnastics.average(data));
        School school=new School(data);
        System.out.println(school.average(data));
    }

}
abstract class ComputerAverage{
    double []data;
    abstract double average(double []data);
}

class Gymnastics extends ComputerAverage{

    public Gymnastics(double []data){
        this.data=data;
    }
    double average(double[] data) {
        double max,min;
        int k1=0;
        int k2=0;
        max=min=data[0];
        for (int i = 0; i <data.length ; i++) {
            if (data[i]>max){
                max=data[i];
                k1=i;
            }
            else if (data[i]<min){
                min=data[i];
                k2=i;
            }
        }
        data[k1]=0;
        data[k2]=0;
        double sum=0;
        for (int i = 0; i <data.length ; i++) {
            sum=sum+data[i];
        }
        sum=sum/(data.length-2);
        return sum;
    }
}

class School extends ComputerAverage{
    public School(double []data){
        this.data=data;
    }


    double average(double[] data) {
        double sum=0;
        for (int i = 0; i <data.length ; i++) {
            sum=sum+data[i];
        }
        sum=sum/data.length;
        return sum;
    }
}