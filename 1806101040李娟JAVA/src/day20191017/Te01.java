package day20191017;

public class Te01  extends  Thread{
    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            System.out.println(this.getName() + this.getId() +" " +i);

            //  线程属性
//            t1.setName("xianchengi:");
//        t1.getPriority();   //优先级
//        t1.getId();  //获得当前线程的编号

            try {
                Thread.sleep(100); //毫秒   每一个线程都设置的话，就会交替
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
