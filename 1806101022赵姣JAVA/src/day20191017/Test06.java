package day20191017;

public class Test06 {
    public static void main(String[] args) {
        Thread t1=new Thread(new Thread7());
        t1.start();
    }
}
