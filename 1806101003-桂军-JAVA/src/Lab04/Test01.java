package Lab04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
        public static void main(String[] args) throws InterruptedException {
            ThreadImp threadImp = new ThreadImp();
            Thread thread1 = new Thread(threadImp);
            thread1.start();
        }
    }
    class ThreadImp extends Thread{
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("StartThread-"+(i+1)+":"+new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:Ms").format(new Date()));
                System.out.println("hello world");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

