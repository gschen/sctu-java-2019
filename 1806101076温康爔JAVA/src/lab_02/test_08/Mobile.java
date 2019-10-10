package lab_02.test_08;

public class Mobile implements Usb{
    @Override
    public void start() {
        System.out.println("mobile start");
    }

    @Override
    public void stop() {
        System.out.println("mobile stop");
    }
}
