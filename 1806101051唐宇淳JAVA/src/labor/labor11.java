package labor;

import java.util.Scanner;

public class labor11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int count = 0;
        while (i != 0) {
            i /= 10;
            count++;
        }
        System.out.println(count);
    }
}
