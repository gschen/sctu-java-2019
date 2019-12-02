package day20191017;

public class T20 extends Thread{
    @Override
    public void run() {
        for (int i = 20; i < 40; i++) {
            System.out.println("二线程" + i);
            try {
                T00.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
