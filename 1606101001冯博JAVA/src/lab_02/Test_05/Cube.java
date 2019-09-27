package lab_02.Test_05;

public class Cube {
    double l;
    double w;
    double h;
    void print(){
        this.l = l;
        this.w = w;
        this.h = h;
        System.out.println("立方体的体积为：" + this.l * this.w * this.h);
    }
    public static void main(String[] args) {
        Cube bulk = new Cube();
        bulk.l = 201.1;
        bulk.w = 100.2;
        bulk.h = 200.2;
        bulk.print();
    }
}
