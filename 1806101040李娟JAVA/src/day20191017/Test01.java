package day20191017;

public class Test01 {
    public static void main(String[] args) {

        Te06 te06 = new Te06(0);
        te06.setName("第一个线程：");
        te06.start();

        Te06 t2 = new Te06(20);
        t2.setName("第二个线程：");
        t2.start();

        Te06 T3 = new Te06(40);
        T3.setName("第三个线程：");
        T3.start();

        Te06 t4 = new Te06(60);
        t4.setName("第四个线程：");
        t4.start();

        Te06 t5 = new Te06(80);
        t5.setName("第五个线程：");
        t5.start();
    }
}
