package day20191017;

public class Test extends  Thread {  //继承了Thread的类才是线程
    @Override
    public void run() {
        System.out.println("这是一个继承了Thread的类的线程。");
    }
}
