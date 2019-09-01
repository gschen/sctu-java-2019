package Lab_01;

public class Test_10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean flag = false;
            for (int j = 2; j <= 100; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(i);
            }
        }
    }
}
