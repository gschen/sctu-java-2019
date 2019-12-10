package day20191017;

public class T60 extends Thread{
    @Override
    public void run() {
        for (int i = 60; i < 80; i++) {
            System.out.println("四线程" + i);
            try {
                T00.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
