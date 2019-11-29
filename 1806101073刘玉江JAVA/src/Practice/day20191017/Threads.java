package src.Practice.day20191017;

public class Threads extends Thread {
    private int startNo;
    //快速完成构造函数。
    //构造函数的作用是：初始化的时候，对成员变量进行赋值。
    public Threads(int startNo) {
        this.startNo = startNo;
    }

    @Override
    public void run(){

        for (int i = startNo; i <startNo + 20; i++) {
            System.out.println(this.getName()+":"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
