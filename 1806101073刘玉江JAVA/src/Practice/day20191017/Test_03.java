package src.Practice.day20191017;

public class Test_03 {
    public static void main(String[] args) {

        Threads t1 = new Threads(0);
        t1.setName("第一个线程");
        t1.start();
        Threads t2 = new Threads(20);
        t2.setName("第二个线程");
        t2.start();
        Threads t3 = new Threads(40);
        t3.setName("第三个线程");
        t3.start();
        Threads t4 = new Threads(60);
        t4.setName("第四个线程");
        t4.start();
        Threads t5 = new Threads(80);
        t5.setName("第五个线程");
        t5.start();
    }
}
