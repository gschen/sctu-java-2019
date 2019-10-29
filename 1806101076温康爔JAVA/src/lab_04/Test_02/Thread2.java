package lab_04.Test_02;

public class Thread2 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        ThreadImp2 threadImp2 = new ThreadImp2();
        Thread thread2 = new Thread(threadImp2);
        thread2.start();
    }
}
