package day20191017;

public class Test05 {
    public static void main(String[] args) {
        Thread7 t1 = new Thread7(0);
        t1.setName("第1个线程");
        t1.start();

        Thread7 t2 = new Thread7(20);
        t2.setName("第2个线程");
        t2.start();

        Thread7 t3 = new Thread7(40);
        t3.setName("第3个线程");
        t3.start();
    }

}
