package lab_04.Test_01;

public class Test_02 implements Runnable {


    @Override
    public  void run() {
        for (int i = 0;i<20;i++) {
            System.out.println("hello.world!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }


        public static void main(String[] args) {
            Test_02 test_02 = new Test_02();
            test_02.run();
}
}
