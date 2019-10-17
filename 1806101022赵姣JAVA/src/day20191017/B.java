package day20191017;

public class B extends Thread {
    @Override
    public  void run(){
        for (int i=40;i<60;i++){
            System.out.println("第三个线程:"+i);
            try {

                Thread.sleep(100);//休息100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
