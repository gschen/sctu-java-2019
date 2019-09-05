package lab_01;

public class Text_08 {
    public static void main(String[] args) {
        int sum;

        for (int i = 1; i< 10; i++) {
            for (int j = 1; j <= i;j++) {
                sum = i * j;
                System.out.print( j+ "*" + i + "=" + sum+"\t");

            }
            System.out.println("");
        }
    }
}
