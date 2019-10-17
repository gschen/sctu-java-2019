package lab02.Test_26;

public class Test_26 {
    public static void main(String[] args) {
        for (int i = 0;i<101;i++) {
            System.out.println(i);
            if (i == 50) {
                try {
                    System.out.println(i / 0);
                }
                catch(ArithmeticException e) {
                    System.out.println("除0错误！");
                }
                finally {
                    System.out.println("证实!");
                }
            }
        }
    }
}
