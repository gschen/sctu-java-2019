package lab_04.Test_02;

public class Thread1 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ThreadImp1 threadImp1 = new ThreadImp1();
        Thread thread1 = new Thread(threadImp1);
        thread1.start();
    }
}