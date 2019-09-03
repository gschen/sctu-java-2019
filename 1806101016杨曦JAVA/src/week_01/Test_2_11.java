package week_01;

public class Test_2_11 {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRST";
        int index = 0;
        for (int i = 0; i < 8; i++) {
            int sum = (int)Math.abs(i-3.5);
            printTab(sum);
            for (int j=0;j<4-sum;j++) {
                System.out.print(str.charAt(index)+" ");
                index += 1;
            }
            System.out.println();
        }
    }

    private static void printTab(int sum) {
        for (int i = 0; i < sum; i++) {
            System.out.print(" ");
        }
    }
}
