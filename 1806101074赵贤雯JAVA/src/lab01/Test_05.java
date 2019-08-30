package lab01;

public class Test_05 {
    public static void main(String[] args) {
        int score = 3;
        String str = "不及格";
        if (score == 1) {
            str = "不及格";
        } else if (score == 2) {
            str = "及格";
        } else if (score == 3) {
            str = "中等";
        } else if (score == 4) {
            str = "良好";
        } else if (score == 5) {
            str = "优秀";
        }
        System.out.println(str);
    }
}

