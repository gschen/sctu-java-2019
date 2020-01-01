package day20191017;

public class Thread6 extends Thread{
    private int startNo;
    //构造函数的作用是：初始化的时候，对成员变量进行赋值。
    public Thread6(int startNo) {
        this.startNo = startNo;
        for(int i=startNo;i<startNo+20;i++){
            System.out.println(+i);
        }
    }




}
