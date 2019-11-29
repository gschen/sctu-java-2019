package day20191017;

public class main2 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1(0);
        thread1.setName("线程1： ");
        thread1.start();
        Thread1 thread2 = new Thread1(20);
        thread2.setName("线程2： ");
        thread2.start();
        Thread1 thread3 = new Thread1(40);
        thread3.setName("线程3： ");
        thread3.start();
        Thread1 thread4 = new Thread1(60);
        thread4.setName("线程4： ");
        thread4.start();
    }
}
