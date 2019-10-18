package day20191017;

public class Te06  extends  Thread{

    private int startNo = 1;

    //快速自动生成构造函数 鼠标右键 Generate constructor
    //构造函数作用 ：初始化时 对成员变量进行赋值
    public Te06(int startNo) {
        this.startNo = startNo;
    }

    @Override
    public void run() {


        for (int i = startNo; i <= startNo +20; i++) {
            System.out.println(this.getName() + i);    // 继承类才有this.getName
        }

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
