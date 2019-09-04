package lab01;

public class test_10 {
    public static void main(String[] arge) {
        for (
                int i = 2;
                i <= 1000; i++) {

            for (int n = 2; n <= 500; n++) {
                if (i % n == 0) {
                    if (n < i)
                        break;
                    if (n == i)
                        System.out.print(i + " ");
                    break;
                }

                if (i % n != 0) {
                    if (n == 500)
                        System.out.print(i + " ");
                }


            }
        }
    }
}
