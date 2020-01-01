package day20191017;

public class Thread4 extends Thread{
    @Override
    public void run() {

        for (int i = 60; i < 80; i++){
            System.out.println("这是第三个线程：" + i);

            try {
                Thread4.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}