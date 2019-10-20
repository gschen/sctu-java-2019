package day20191017;

public class Te03 extends Thread {
    @Override
    public void run() {
        for (int i = 40; i < 60; i++) {
            System.out.println("第三个线程："+i);
        }
    }
}
