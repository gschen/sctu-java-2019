package day20191017;

public class Test_03 extends Thread{
    @Override
    public void run() {
        System.out.println("这是线程二");
        for (int i=20;i<39;i++){
            System.out.println("线程二"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
