package day20191017;

public class Test02 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
        Thread3 thread3 = new Thread3();
        thread3.start();
        Thread4 thread4 = new Thread4();
        thread4.start();
        Thread5 thread5 = new Thread5();
        thread5.start();
    }

}
