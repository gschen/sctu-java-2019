package Day20191017;

public class Thread7 extends Thread implements Runnable {
    private int startNo;
    public Thread7(int startNo) {
        this.startNo = startNo;
    }

    @Override
    public void run() {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = startNo; i < startNo + 20; i++) {
            System.out.println(this.getName() + i);
        }
    }
}
