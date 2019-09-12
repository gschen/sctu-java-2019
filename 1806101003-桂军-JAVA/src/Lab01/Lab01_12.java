package Lab01;

public class Lab01_12 {
    public static void main(String[] args) {
        for (int a = 100; a <= 1000; a++) {
            if (fun(a)) {
                System.out.println(a + "是水仙花数");
            }
        }
    }

    static boolean fun(int i) {
        int s = 0;
        int n = (i + "").length();
        for (int k = 1; k <= n; k++) {
            int t1 = (int) (i / Math.pow(10, k - 1));
            int t2 = (int) Math.pow(t1 % 10, n);
            s = s + t2;
        }
        if (s == i) {
            return true;
        } else {
            return false;

        }
    }
}
