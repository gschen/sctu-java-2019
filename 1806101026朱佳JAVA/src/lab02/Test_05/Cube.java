package lab02.Test_05;

public class Cube {
    double chang;
    double width;
    double height;

    double volume(){
        return this.chang *this.width *this.height;
    }

    public static void main(String[] args) {
        Cube c1=new Cube();

        c1.chang=5;
        c1.width=3;
        c1.height=2;

        c1.volume();

        System.out.println(c1.volume());
    }
}

