package day20190927;

public class Test_02 {
    public static void main(String[] args) {
        for (int i = 0;i < 100;i++){
            if (i == 50){
                try {
                    throw  new NullPointerException();
                }catch (NullPointerException e){
                    System.out.println("空指针错误！");
                }finally {

                }

            }

        }
    }
}
