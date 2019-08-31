package lab_01;

public class Test_02 {
    public static void main(String[] args) {
        int n;
        for(n=100;n<=300;n++) {
            if (n % 3 == 0){
                continue;
            }
            else{
                System.out.println(n);
            }
        }
    }
}
