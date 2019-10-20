package Day20191017;

public class Test_03 extends Thread {
    @Override
    public void run() {
        for (int i= 21; i<=40; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + i);
        }
    }
}
