package day20190927;

public class Test_01 {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            if (i==50){
                try {
                    throw new NegativeArraySizeException();
                }catch (NegativeArraySizeException e){
                    System.out.println("空指针错误");
                }finally {

                }

            }
        }

    }
}
