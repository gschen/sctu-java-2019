package day20191017;

public class C extends Thread {
    @Override
    public  void run(){
        for (int i=60;i<80;i++){
            System.out.println("第四个线程:"+i);
            try {
                Thread.sleep(100);//休息100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
