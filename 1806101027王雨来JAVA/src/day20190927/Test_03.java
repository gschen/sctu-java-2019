package day20190927;

public class Test_03 {
    private static void work(int i)throws ArithmeticException{
        System.out.print(i + " ");
        if(i == 50) System.out.println(1 / 0);
    }

    public static void main(String[] args) {
        for (int i =0 ; i <100 ; i++) {
            work(i);
        }
    }
}
