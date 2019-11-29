package src.Practice.day20191017;

public class Thread7 implements Runnable{
    private int startNo;
    private String Name;
    public Thread7(int startNo,String Name) {
        this.startNo = startNo;
        this.Name = Name;
    }

    @Override
    public void run() {
        System.out.println("这是一个实现Runnable接口的线程类。");
        for (int i = startNo; i < startNo + 20; i++) {
            System.out.println(Name+":"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
