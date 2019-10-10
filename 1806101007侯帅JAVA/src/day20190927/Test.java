package day20190927;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
            if (i==50){
            try {
                int [] a = new  int[5];
                a[6] = 11;
                System.out.println(i/0);
            }
//            catch (ArithmeticException e){//catch里面是错误类型
//                System.out.println("你在瞎搞，不能除以0啊");
//            }
//            catch (Exception e){
//                //当不知道会发生什么错误是，把错误类型统一写成Exception
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("数组越界错误");
//
//            }
//            catch (ArithmeticException e){
//                System.out.println("除0错误");
//            }
            catch (Exception e){
                System.out.println(e.toString());
            }
           finally {

            }
        }
    }}
}
