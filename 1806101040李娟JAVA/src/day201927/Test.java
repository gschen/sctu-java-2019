package day201927;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);

              //运行前出错 编译出错
            //运行中出错  exception错误
            try{
                i = 1/0;
            }

            catch (ArithmeticException e){
                e.printStackTrace();// System.out.println("这是除0错误");
            }
        }
    }
}
