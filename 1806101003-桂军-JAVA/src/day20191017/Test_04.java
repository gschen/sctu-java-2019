package day20191017;

public class Test_04 extends Thread{
    @Override
    public void run() {
        for (int i = 41; i<= 60; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + i);
        }
    }
}
