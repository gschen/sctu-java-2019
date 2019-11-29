package lab_04.Test_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadImp threadImp = new ThreadImp();
        Thread thread1 = new Thread(threadImp);
        thread1.start();
    }
}
