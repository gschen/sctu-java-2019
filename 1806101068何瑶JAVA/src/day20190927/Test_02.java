package day20190927;

public class Test_02 {
    static void work(int i){
        System.out.println(i);
        if (i==50)
                try {
                    System.out.println(i/0);
                }catch (ArithmeticException e){
                    System.out.println("除零错误");
                }finally {

                }
    }
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
           work(i);
        }
    }
}
