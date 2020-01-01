package day20191017;

public class Test_05 extends Thread {
    @Override
    public void run() {
        System.out.println("线程四");
        for (int i=69;i<=99;i++){
            System.out.println("线程四"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
