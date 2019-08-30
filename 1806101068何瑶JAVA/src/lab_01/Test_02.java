package lab_01;

public class Test_02 {
    public static void main(String[] args) {
        int num;
        for (num = 100; num >= 100 && num <= 300; num++) {
            if (num % 3 == 0) {
                continue;
            }
            System.out.println("不能被3整除的数"+num);
        }
    }
}
