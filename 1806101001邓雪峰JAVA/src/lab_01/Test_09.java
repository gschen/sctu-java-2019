package lab_01;

public class Test_09 {
    public static void main(String[] args) {
        //上三角
        for (int i = 1; i <=4 ; i++) {
            int a = 8 - 2*i;
            for (int j = 0; j <a ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                int c = 63 + j +i*(i-1)/2+1;
                System.out.print((char)c + "   ");

            }

            System.out.println();
        }

        //下三角
        for (int i = 4; i >= 1; i--) {
            int b = 8 + 2 * (-i);
            for (int j = 0; j < b; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                int d = 69 + j +5*(5-i)-(5-i)*(4-i)/2;
                System.out.print((char)d + "   ");
            }
            System.out.println();
        }

    }
}
