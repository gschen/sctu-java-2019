package week_01;

public class Test_2_10 { public static void main(String[] args) {
    int i, n;

    for ( i = 1; i <=9; i++) {
        for ( n = 1; n <=i; n++) {
            System.out.print(n+"*"+i+"="+i *n+" ");
        }
        System.out.println();
    }
}
}
