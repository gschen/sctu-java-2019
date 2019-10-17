package day20191017;

public class Te04 extends  Thread {
    @Override
    public void run() {
        for (int i = 60; i < 80; i++) {
            System.out.println("第四个线程："+i);
        }
    }
}
