package day20191017;

public class Thread5 extends Thread {
    @Override
    public void run() {
        for (int i = 80; i <100 ; i++) {
            System.out.println("这是第5个线程" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
