package day20191017;

public class Test02 extends Thread{
    @Override
    public  void run(){

        //线程的属性
        this.getName();//名字
        this.getId();//编号


        System.out.println("第一个线程");
        for (int i=0;i<20;i++){
            System.out.println("第一个线程："+i);

            try {
                Thread.sleep(100);//休息100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
