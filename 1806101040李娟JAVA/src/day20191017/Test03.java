package day20191017;

public class Test03 {
    public static void main(String[] args) {

        // 启动继承接口 线程
        Thread t1= new Thread(new Te07(0));
        t1.setName("线程1:");
        t1.start();

        Thread t2= new Thread(new Te07(20));
        t2.setName("线程2:");
        t2.start();

        Thread t3= new Thread(new Te07(40));
        t3.setName("线程3:");
        t3.start();

        Thread t4= new Thread(new Te07(60));
        t4.setName("线程4:");
        t4.start();

        Thread t5= new Thread(new Te07(80));
        t5.setName("线程5:");
        t5.start();
    }
}
