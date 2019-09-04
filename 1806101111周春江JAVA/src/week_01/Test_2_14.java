package week_01;

public class Test_2_14 {
    public static void main(String[] args) {
            int a;
            for (int i = 3; i <= 1000 ; i++) {
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
