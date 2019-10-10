package lab02.Test_13;

public abstract class ComputerAverage {
    double []data;
    abstract double average(int a,double []data);

    public abstract double average(double[] data);
}
class Gymnastics extends ComputerAverage {
    double[] data;

    Gymnastics() {

    }

    Gymnastics(double[] data) {
        this.data = data;

    }

    public double average(double[] data) {
        double max, min;
        int k1 = 0, k2 = 0;
        max = min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
                k1 = i;
            } else if (data[i] < min) {
                min = data[i];
                k2 = i;
            }
        }
        data[k1] = 0;
        data[k2] = 0;
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        sum = sum / (data.length - 2);
        return sum;
    }

    @Override
    double average(int a, double[] data) {
        return 0;
    }
}
class School extends ComputerAverage {

    @Override
    double average(int a, double[] data) {
        return 0;
    }
    double []data;
    School(){

    }
    School(double []data){
        this.data=data;
    }
    public double average(double[] data) {
        double sum=0;
        for(int i=0;i<data.length;i++){
            sum+=data[i];
        }
        sum=sum/data.length;
        return sum;
    }
}