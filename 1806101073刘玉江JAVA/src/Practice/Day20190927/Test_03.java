package Practice.Day20190927;

public class Test_03 {

    static void work( int j) throws ArithmeticException {
        System.out.println(j);
        if (j == 50){

                System.out.println(j/0);

        }
    }
    public static void main(String[] args) {
        for ( int i = 0; i<=100;i++){
            try {
                work(i);
            }catch (ArithmeticException e){
                System.out.println("错误");
            }
        }
    }





}
