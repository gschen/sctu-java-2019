package day20190927;

public class Test {
    //1.成员变量
    int a;

    public static void main(String[] args) {
        for (int i = 0; i<100; i++){
            System.out.println(i);
            if (i==50){
                try {
                    int [] a = new int [5];
                    a [6]= 10;
                    System.out.println(i/0);
                }catch (ArithmeticException e){
                    System.out.println(e.toString());

                }finally {
                    //不管出错与否最终都会执行
                }

            }
        }
    }
}
