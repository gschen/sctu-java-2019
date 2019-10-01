package day20190927;

public class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
            try{
                if (i == 5){
                    System.out.println(i / 0);
            }
            }catch (ArithmeticException e){
                System.out.println("你的除数为0");
            }
        }
    }
}
