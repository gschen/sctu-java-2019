package Lab_01;

public class Test_02 {
    public static void main(String[] args) {
        for ( int i = 100; i < 301; i++ ) {
            if (i % 3!= 0 ) {
                System.out.println (i);
            }
            else {
                continue;
            }
        }
    }
}

