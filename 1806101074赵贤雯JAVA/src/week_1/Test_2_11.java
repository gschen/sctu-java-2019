package week_1;
//打印菱形
public class Test_2_11 {
    public static void main(String[] args) {
        int ascii = 65;

        for (int r = 1; r <= 4; r++) {       //r：行数；k：空格数
            int k = (4-r)*2;
            for (int i = 1; i <= k; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= r; i++) {
                System.out.print((char)ascii+"   ");
                ascii++;
            }
            System.out.println();
        }

        for (int r = 1; r <= 4; r++) {
            int k = (r-1)*2;
            for (int i = 1; i <= k; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 5-r; i++) {
                System.out.print((char)ascii+"   ");
                ascii++;
            }
            System.out.println();
        }
    }
}
