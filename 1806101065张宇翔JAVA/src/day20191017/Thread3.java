package day20191017;

public class Thread3 extends Thread{
    @Override
    public void run() {

        for (int i = 40; i < 60; i++){
            System.out.println("这是第三个线程：" + i);

            try {
                Thread3.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}