package lab_02.test_8;

public class Mobile implements USB {
    @Override
    public void start() {
        System.out.println("Mobile USB start");
    }

    @Override
    public void stop() {
        System.out.println("Mobile USB stop");
    }
}
