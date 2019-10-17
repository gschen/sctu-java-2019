package src.Practice.day20191017;

public class Thread_01 extends Thread {
    @Override
    public void run() {
        //线程属性
        //this.getId();获得当前线程的编号
        //this.getName();获得当前线程的名字
        System.out.println("这是第一个线程。");
        for (int i = 0; i<20;i++){

            System.out.println(this.getName()+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
