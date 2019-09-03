package lab_01;

public class test_02 {
    public static void main(String[] args) {
        for (int i = 100; i <=300; i++) {
            if (i % 3 == 0){
                continue;
            }
            else System.out.println(i);
        }
    }
}
