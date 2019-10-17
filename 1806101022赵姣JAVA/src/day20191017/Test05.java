package day20191017;

public class Test05 {
    public static void main(String[] args) {
        E e1=new E(0);
        e1.setName("第1个线程");
        e1.start();

        E e2=new E(20);
        e2.setName("第2个线程");
        e2.start();

        E e3=new E(40);
        e3.setName("第3个线程");
        e3.start();

        E e4=new E(60);
        e4.setName("第4个线程");
        e4.start();

        E e5=new E(80);
        e5.setName("第5个线程");
        e5.start();

    }
}
