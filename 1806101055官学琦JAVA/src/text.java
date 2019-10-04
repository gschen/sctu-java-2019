public class text {
    static void work(int i) throws ArithmeticException{
        System.out.println(i);
        if (i==50){
            System.out.println(i/0);
//            try {
//                System.out.println(i/0);
//            }catch (ArithmeticException e){
//                System.out.println("错误");
//            }finally {
//
//            }
        }
    }
    public static void main(String[] a){

        for (int i = 0; i <100 ; i++) {
//            System.out.println(i);
            try {
                work(i);
            }catch (ArithmeticException e){
                System.out.println("错误");
            }finally {

            }
        }
    }
}
