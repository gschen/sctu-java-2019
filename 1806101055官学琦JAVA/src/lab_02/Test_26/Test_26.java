package lab_02.Test_26;

public class Test_26 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }finally {
            System.out.println("hahah");
        }
    }
}
