package lab04.Test3;

public class Runnable1 implements java.lang.Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("1234567890");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("发生异常！");
            }
        }
    }
}