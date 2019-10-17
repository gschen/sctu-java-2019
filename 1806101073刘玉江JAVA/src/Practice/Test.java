package src.Practice;

public class Test {
    private static void p() throws ArithmeticException{
        int i;
        i = 4/0;
    }
    public static void main(String[] args) {
        try {
            p();
        }catch (ArithmeticException e){
            System.out.println("除0错误");
        }
    }
}
