package lab_01;

public class Test_10 {
    public static void main(String[] args) {
    int s = 0;
    for (int i = 3; i <= 100; i++) {
        int g = 1;
        for (int j = 2; j <i; j++)
        {        if (i % j == 0) {
            g = 0;break;
        }
        }
        if (g == 1) {System.out.print(i + "\t");s++;
            if (s % 5 == 0) {System.out.println();
            }
        }
    }
}
}
