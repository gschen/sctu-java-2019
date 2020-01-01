package day20191017;

public class Test_06 extends Thread {
    @Override
    public void run() {
        System.out.println("线程五");
        for (int i=100;i<111;i++){
            System.out.println("线程五"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
