package lab_02.test_36;

public class Undergraduate extends Student {
    public Undergraduate(String name,String category,int[] score) {
        super(name,category,score);
    }

    public void judge() {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        if ((sum / 3) >= 80) {
            System.out.println("优秀");
        } else if ((sum / 3) >= 70 && (sum / 3) < 80) {
            System.out.println("良好");
        } else {
            System.out.println("一般");
        }
    }
}