package week_01;

public class Test_02_09 {
    public static void main(String[] args) {
        int score = 4;
        if (score == 1) {
            System.out.println("不及格");
        } else if (score == 2) {
            System.out.println("及格");
        } else if (score == 3) {
            System.out.println("中等");
        } else if (score == 4) {
            System.out.println("良好");
        } else {
            System.out.println("优秀");

        }



    }

}
class Test_02_09_01 {
    public static void main(String[] args) {
        int score=3;
        switch (score)
        {
            case 1:
                System.out.println("不及格");
                break;
            case 2:
                System.out.println("及格");
                break;
            case 3:
                System.out.println("中等");
                break;
            case 4:
                System.out.println("良好");
                break;
            case 5:
                System.out.println("优秀");
                break;


        }
    }
}
