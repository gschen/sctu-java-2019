package lab_01;

//显示1-100中的素数，每行显示5个数。（素数，一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数。）
public class Test_10 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 2; i <= 100; i++) {
            int g = 1;
            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                g = 0;
                break;
            }
            }
            if (g == 1) {
                System.out.print(i+"\t");
                n++;
                if (n % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
    }

