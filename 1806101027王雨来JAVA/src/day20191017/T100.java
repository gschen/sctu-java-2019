package day20191017;

public class T100 extends Thread {
    private int startNo;
    //快速完成构造函数
    //初始化的时候，对成员变量进行初始化（赋值）
    public T100(int startNo) {
        this.startNo = startNo;
    }

    @Override
    public void run(){
        for (int i = startNo; i < startNo + 20; i++) {
            System.out.println(this.getName() + i);
            try {
                T00.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
}
