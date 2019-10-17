package Day20191017;

public class Thread1  extends  Thread{
    private int startNo;    //写一个startNo 作为成员变量
    //快速的完成构造函数
    public Thread1(int startNo) {    //构造函数的作用是：初始化的时候，对成员变量进行赋值。
        this.startNo = startNo;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = startNo; i < startNo+20; i++) {
            System.out.println(this.getName() + " : " + i);
        }
    }
}
