package day20191017;

public class Test_04 extends Thread {
    @Override
    public void run() {
        System.out.println("线程三");
        for (int i=40;i<69;i++){
            System.out.println("线程三"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
