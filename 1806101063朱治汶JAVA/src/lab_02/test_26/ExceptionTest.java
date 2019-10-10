package lab_02.test_26;

public class ExceptionTest {

    public static void main(String[] args) {

        for (int i = 0; i <100 ; i++) {
            System.out.println(i);

            if (i==50){
                try {
                    System.out.println(i/0);
                }catch (Exception e){

                }finally {
                    System.out.println("......");
                }

            }
        }
    }
}
