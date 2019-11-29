package day20191017;

public class Te02 extends  Thread {
    @Override
    public void run() {
        for (int i = 20; i < 40 ; i++) {
            System.out.println("第二个线程："+i);
        }
    }
}
