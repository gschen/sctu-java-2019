package lab_01;

public class test02 {
    public static void main(String[] args) {
        int n;
        for (n  = 100; n <= 300; n++) {
           if (n % 3 == 0) {
                continue;
            }
            System.out.println(n);

        }
    }
}
