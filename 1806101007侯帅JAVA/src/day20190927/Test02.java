package day20190927;

public class Test02 {
    static void work(int i) throws ArithmeticException{//将错误抛出去
        System.out.println(i);
        if (i == 50) {
//        try {
//
           System.out.println(i/0);//在函数里面不解决错误。谁调用这个函数，谁解决
//
//        }catch (Exception e){
//            System.out.println(e.toString());//将错误类型转化成字符串打印
//        }finally {
//
//        }
//    }}
        }}
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            try {
                work(i);
            }catch (ArithmeticException e){
                System.out.println("除0错误");
            }finally {

            }

        }
    }
}
