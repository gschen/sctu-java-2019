package day201927.yichang;

public class Test01 {
    static void work(int i) throws ArithmeticException{
        System.out.println(i);
        if ( i == 50){

            System.out.println(i/0);

        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            try{
                work(i);
            }catch (ArithmeticException e){
                System.out.println("除0错误！");
            }finally {

            }
        }
    }
}
