package src.Practice.day20191017;

public class Thread_03 extends Thread{
    @Override
    public void run() {
        System.out.println("这是第三个线程。");
        for (int i = 40; i<60;i++){
            System.out.println(this.getName()+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
