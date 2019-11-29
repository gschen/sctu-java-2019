package day20191017;

public class Test03 {
    public static void main(String[] args) {
        Thread1 thread1  = new Thread1();
        Thread2 thread2  = new Thread2();
        Thread3 thread3  = new Thread3();
        Thread4 thread4  = new Thread4();
        Thread5 thread5  = new Thread5();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
