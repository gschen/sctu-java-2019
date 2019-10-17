package labor02.test.Test_26;

public class Test_26 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
            if (i==23){
            try {
                System.out.println(i/0);
            }catch (Exception e){
                System.out.println(e.toString());

            }finally {
                System.out.println("这是异常处理练习");
            }
        }
    }
}}
