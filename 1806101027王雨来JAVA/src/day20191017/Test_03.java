package day20191017;

public class Test_03 {
    public static void main(String[] args) {
        T100 t1 = new T100(0);
        t1.setName("1线程");
        t1.start();
        T100 t2 = new T100(20);
        t2.setName("2线程");
        t2.start();
        T100 t3 = new T100(40);
        t3.setName("3线程");
        t3.start();
        T100 t4 = new T100(60);
        t4.setName("4线程");
        t4.start();
        T100 t5 = new T100(80);
        t5.setName("5线程");
        t5.start();
    }
}
