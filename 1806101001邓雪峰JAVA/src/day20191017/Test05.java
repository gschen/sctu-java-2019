package day20191017;

public class Test05 {
    public static void main(String[] args) {
        Thread6 t1 = new Thread6(0);
        t1.setName("第一个线程");
        t1.start();

        Thread6 t2 = new Thread6(20);
        t2.setName("第二个线程");
        t2.start();

        Thread6 t3 = new Thread6(40);
        t3.setName("第三个线程");
        t3.start();

    }
}
