package lab_02.test_11;

public class Square extends Rectangle{
    Square(){
        System.out.println("这是一个正方形");
    }

    private double diagonal;

    void getDiagonal(){
        diagonal = Math.sqrt(width * width +lenght*lenght);
    }

}
