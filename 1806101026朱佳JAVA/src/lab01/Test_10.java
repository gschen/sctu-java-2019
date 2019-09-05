package lab01;

public class Test_10 {
    public static void main(String[] args) {
        int h = 0;
        for (int i = 1; i <= 100; i += 2) {
            boolean b = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    b = false;
                    break;
                }else {
                    b = true;
                }
            }
            if (b){
                System.out.print(i+" ");
                h++;
                if (h == 5){
                    System.out.println();
                    h=0;

                }
            }
        }
    }
}
