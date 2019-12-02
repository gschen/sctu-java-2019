package day20190927;

public class Test_02 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
            if (i == 50) throw new NullPointerException();//人为强行抛错
        }
    }
}
