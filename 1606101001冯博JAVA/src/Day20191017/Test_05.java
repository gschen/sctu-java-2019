package Day20191017;

public class Test_05 extends Thread {
    @Override
    public void run() {
        for (int i = 61; i<=80; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + i);
        }

    }
}
