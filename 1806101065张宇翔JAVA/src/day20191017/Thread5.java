package day20191017;

public class Thread5 extends Thread{
    @Override
    public void run() {

        for (int i = 80; i < 100; i++){
            System.out.println("这是第五个线程：" + i);

            try {
                Thread5.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}