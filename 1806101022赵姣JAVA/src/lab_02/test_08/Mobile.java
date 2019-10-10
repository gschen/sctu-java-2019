package lab_02.test_08;

public class Mobile implements USB {
    @Override
    public void start() {
        System.out.println("Mobile start!");
    }

    @Override
    public void stop() {
        System.out.println("Mobile stop!");

    }
}
