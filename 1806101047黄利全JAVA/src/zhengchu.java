public class zhengchu {
    public static void main(String[] args) {
        int i, j, n = 0;
        outer:
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                n = n + 1;
                if (j == 1) continue outer;
                System.out.println(i + "," + j);
            }

        }
        System.out.println("n=" + n);
    }
}
