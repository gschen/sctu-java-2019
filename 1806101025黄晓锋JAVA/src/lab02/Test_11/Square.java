package lab02.Test_11;

public class Square extends Rectangle{
    Square(){
        System.out.println("这是一个正方形");
    }

    private double diagonal;

    void getDiagonal(){
        diagonal = Math.sqrt(width * width +lenght*lenght);
    }

}