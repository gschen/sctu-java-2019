package day201927.yichang;

public class Test02 {
    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {

            System.out.println(i);

            if( i == 50){

                try{

                    throw new NullPointerException();
                }catch (NullPointerException e){

                    System.out.println("空指针错误。");
                }finally {

                }
            }
        }



    }
}
