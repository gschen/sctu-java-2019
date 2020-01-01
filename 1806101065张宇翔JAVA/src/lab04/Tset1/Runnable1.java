package lab04.Tset1;

public class Runnable1 implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello,World!" + " ");

            try {
                Thread.sleep(1000);      //打印1次，休息1秒
            } catch (Exception e) {
                System.out.println("发生异常！");
            }
        }
    }
}