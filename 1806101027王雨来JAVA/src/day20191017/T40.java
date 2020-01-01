package day20191017;

public class T40 extends Thread{
    @Override
    public void run() {
        for (int i = 40; i < 60; i++) {
            System.out.println("三线程" + i);
            try {
                T00.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
