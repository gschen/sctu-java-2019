package src.lab_02.Test_26;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            int a = 6/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("除0错误");
        }
    }
}
