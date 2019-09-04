package Lab_01;

public class Test_09 {
    public static void main(String[] args) {
        //h：行数；k：空格数
        int ascii = 65;

        for (int h = 1; h <= 4; h++) {
            int k = (4-h)*2;
            for (int i = 1; i <= k; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= h; i++) {
                System.out.print((char)ascii+"   ");
                ascii++;
            }
            System.out.println();
        }

        for (int h = 1; h <= 4; h++) {
            int k = (h-1)*2;
            for (int i = 1; i <= k; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 5-h; i++) {
                System.out.print((char)ascii+"   ");
                ascii++;
            }
            System.out.println();
        }
    }
}
