package lab_02;

public class Test_03_Cube {
    double l;
    double w;
    double h;


    void print(){
        this.l = l;
        this.w = w;
        this.h = h;
        System.out.println("立方体的面积为：" + this.l * this.w * this.h);
    }

    public static void main(String[] args) {
        Test_03_Cube bulk = new Test_03_Cube();
        bulk.l = 201.1;
        bulk.w = 100.2;
        bulk.h = 200.2;
        bulk.print();
    }
}
