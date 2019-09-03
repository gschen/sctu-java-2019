package lab_01;

public class test_12 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000 ; i++) {
            int a = i/100;
            int b = (i - a * 100) / 10;
            int c = i - b *10- a*100 ;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }

        }


    }
}
