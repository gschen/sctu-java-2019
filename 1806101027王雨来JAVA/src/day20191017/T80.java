package day20191017;

public class T80 extends Thread{
    @Override
    public void run() {
        for (int i = 80; i < 100; i++) {
            System.out.println(getName() + i);
            try {
                T00.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
