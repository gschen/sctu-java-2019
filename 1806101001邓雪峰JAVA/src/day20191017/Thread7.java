package day20191017;

public class Thread7 implements Runnable {
    int startNo;


    @Override
    public void run() {

        System.out.println("这是一个实现runnable接口的线程类。");
        for (int i=0;i<20;i++){
            System.out.println(i);
        }
    }
}
