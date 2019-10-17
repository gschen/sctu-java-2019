package day20191017;

public class D extends  Thread{
    @Override
    public  void run(){
        for (int i=80;i<100;i++){
            System.out.println("第五个线程:"+i);
            try {
                Thread.sleep(100);//休息100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
