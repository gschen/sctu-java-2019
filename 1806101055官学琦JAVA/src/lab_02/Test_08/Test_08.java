package lab_02.Test_08;

public class Test_08 implements USB {

    @Override
    public void start() {
        System.out.println("usb disk writer start!");
    }

    @Override
    public void stop() {
        System.out.println("usb disk writer stop!");
    }
}


