package lab02.Test_36;

public class Postgraduate extends Student {
    public Postgraduate(String name, String type, int[] score) {
        super(name, type, score);
    }

    @Override
    public void judge() {
        int sum = 0;
        for (int i = 0;i < score.length; i++){
            sum += score[i];
        }
        if ((sum / 3) >=90){
            System.out.println("优秀");
        }else if ((sum / 3) >=80 &&(sum / 3) < 90){
            System.out.println("良好");
        }else {
            System.out.println("一般");
        }
    }
}
