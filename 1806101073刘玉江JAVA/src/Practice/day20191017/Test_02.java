package src.Practice.day20191017;

public class Test_02 {
    public static void main(String[] args) {
        Thread_01 thread_01 = new Thread_01();
        thread_01.setName("线程一:");
        Thread_02 thread_02 = new Thread_02();
        thread_02.setName("线程二:");
        Thread_03 thread_03 = new Thread_03();
        thread_03.setName("线程三:");
        Thread_04 thread_04 = new Thread_04();
        thread_04.setName("线程四:");
        Thread_05 thread_05 = new Thread_05();
        thread_05.setName("线程五:");

        thread_01.start();
        thread_02.start();
        thread_03.start();
        thread_04.start();
        thread_05.start();
    }
}
