package lab04.Test3;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("现在打印1秒1个‘Hello，World！’和2秒1个‘1234567890’");

        Thread1 test01 = new Thread1();
        test01.start();

        Thread test3 = new Thread(new Runnable1());
        test3.start();

    }
}
