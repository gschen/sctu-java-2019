package lab_04.Test_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadImp2 extends Thread2 {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("StartThread-"+(i+1)+":"+new SimpleDateFormat("yyyy/MM/dd hh:mm:ss:Ms").format(new Date()));
            System.out.println("1234567890");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
