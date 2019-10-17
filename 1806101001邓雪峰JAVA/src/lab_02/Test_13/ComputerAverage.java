package lab_02.Test_13;

public abstract class  ComputerAverage {
    public int a;
    public int b;
    public int c;
    public int d;
    public void average(int a1, int b1, int c1, int d1){
        a = a1;
        b = b1;
        c = c1;
        d = d1;
    }

    abstract double getAverage();
}
