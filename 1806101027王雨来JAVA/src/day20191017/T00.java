package day20191017;

public class T00 extends Thread{//当一个类继承了Thread的时候就是一个线程
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("一线程" + i);
            try {
                T00.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
