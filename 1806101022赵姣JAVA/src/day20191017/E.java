package day20191017;

public class E extends  Thread {
    public int startNo;

    //快速完成构造函数  右键选择Generate
    //初始化的时候，对成员变量进行赋值

    public E(int startNo) {
        this.startNo = startNo;
    }

    @Override
    public void run(){
        for (int i=startNo;i<startNo+20;i++){
            System.out.println(this.getName()+":"+i);

            try {
                Thread.sleep(100);  //休息100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
