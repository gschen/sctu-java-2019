package week_01;

public class Test_2_12_3 {
    public static void main(String[] args) {
        int n = 0, i = 0;

        do {
            i++;

            n += i;
        }

        while (i < 1000);
        System.out.println(n);


    }
}
