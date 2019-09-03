package lab01;

public class test10 {
    public static void main(String[] args) {

        int n = 1;
        for (int i = 1; i <= 100; i++) {
            int g;
            for (g = 2; g < i; g++) {
                if (i % g == 0) {
                    break;
                }
            }
            if (g == i) {
                if (n % 5 == 0) {
                    System.out.print(i + " ");
                    System.out.println();
                } else {
                    System.out.print(i + " ");
                }
                n++;
            }
        }
        System.out.println();
    }
}


