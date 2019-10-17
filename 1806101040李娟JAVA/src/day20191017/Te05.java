package day20191017;

public class Te05 extends Thread {
    @Override
    public void run() {
        for (int i = 80; i <= 100; i++) {
            System.out.println("第五个线程："+i);
        }
    }
}
