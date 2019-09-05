package lab_01;

public class Test_10 {
    public static void main(String[] args) {
        int a;
        for (int i = 2; i <= 100 ; i++) {
            a = 2;
            while (i % a != 0){
                a++;
                }
            if (a == i){
                System.out.println(i);
            }

        }
    }
}
