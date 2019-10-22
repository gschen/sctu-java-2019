package day20191017;

public class Test_06 {
    public static void main(String[] args) {
        Thread7 thread7 = new Thread7(0);
        thread7.setName("线程1： ");
        Thread t1 = new Thread(thread7);
        t1.start();
}
}
