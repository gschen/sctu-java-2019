package lab_01;

public class Test_02 {
    public static void main(String[] args) {
        for(int n=100;n<=300;n++) {
            if (n % 3 == 0){
                continue;
            }
                System.out.println(n);
        }
    }
}
