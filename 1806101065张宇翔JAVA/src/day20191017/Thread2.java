package day20191017;

public class Thread2 extends Thread{
    @Override
    public void run() {

        for (int i = 20; i < 40; i++){
            System.out.println("这是第二个线程：" + i);

            try {
                Thread2.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}