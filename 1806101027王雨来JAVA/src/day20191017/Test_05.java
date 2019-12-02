package day20191017;


public class Test_05 implements Runnable{
    private int startNo;

    public Test_05(int startNo) {
        this.startNo = startNo;
    }

    @Override
    public void run() {
        for (int i = startNo; i <startNo+20 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Test2{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Test_05(20));//实例化的时候两次new
        t1.setName("第一个线程");
        t1.start();
    }
}