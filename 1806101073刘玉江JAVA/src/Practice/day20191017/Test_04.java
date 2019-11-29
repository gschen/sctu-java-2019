package src.Practice.day20191017;

public class Test_04  {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread7(0,"第一个线程"));
        t1.start();
        Thread t2 = new Thread(new Thread7(20,"第二个线程"));
        t2.start();
    }
}
