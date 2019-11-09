package day20191017;

public class Thread1 extends Thread{
    @Override
    public void run() {


        for (int i = 0; i < 20; i++){
            System.out.println(this.getName() + i);

            try {
                Thread1.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}