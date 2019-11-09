package lab04.Test2;

public class TestThread {
    public static void main(String args[]) {
        Test01 mt = new Test01();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.start();
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {}
        mt.flag=false;
        t2.start();
    }
}


