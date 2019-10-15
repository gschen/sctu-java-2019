package lab_02.Test_37;

public class Undergraduate extends Student {
    public Undergraduate(int[] grade){
        this.grade=grade;
    }
    @Override
    void avg() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += grade[i];
        }
        if (sum / 3 >= 60) {
            System.out.println("你的平均成绩没有超过60分，不能拿到学位");
        }
        else {
            System.out.println("恭喜你获得学位");
        }
    }
}
