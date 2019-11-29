package day20191017;

public class Test05 {
    public static void main(String[] args) {

        Thraed6 t1 = new Thraed6(0);
        t1.setName("第一个线程");
        t1.start();
        try {
            Thraed6.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thraed6 t2 = new Thraed6(20);
        t2.setName("第二个线程");
        t2.start();
        try {
            Thraed6.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thraed6 t3 = new Thraed6(40);
        t3.setName("第三个线程");
        t3.start();
        try {
            Thraed6.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thraed6 t4 = new Thraed6(60);
        t4.setName("第四个线程");
        t4.start();
        try {
            Thraed6.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thraed6 t5 = new Thraed6(80);
        t5.setName("第五个线程");
        t5.start();
        try {
            Thraed6.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
