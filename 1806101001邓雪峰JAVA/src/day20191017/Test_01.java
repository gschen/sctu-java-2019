package day20191017;

public class Test_01 extends Thread{

    @Override
    public void run(){
        System.out.println("这是一个继承了thread类的线程");
        for (int i =0;i<20;i++){
            System.out.println(getName()+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
