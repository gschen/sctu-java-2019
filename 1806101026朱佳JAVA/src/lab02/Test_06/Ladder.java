package lab02.Test_06;

public class Ladder {
    double shangdi;
    double xiadi;
    double height;

    double ladArea(){return ((this.shangdi+this.xiadi)*this.height )/2;}

    public static void main(String[] args) {
        Ladder l1=new Ladder();

        l1.shangdi =2;
        l1.xiadi =5;
        l1.height =4;

        l1.ladArea();//访问方法

        System.out.println(l1.ladArea());
    }
}
