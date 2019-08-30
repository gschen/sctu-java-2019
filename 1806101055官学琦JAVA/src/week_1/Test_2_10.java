package week_1;

public class Test_2_10 {
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(j+"x"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
