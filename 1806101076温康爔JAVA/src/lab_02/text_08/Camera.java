package lab_02.text_08;

public class Camera implements Usb {
    @Override
    public void start() {
        System.out.println("camera start");

    }

    @Override
    public void stop() {
        System.out.println("camera stop");
    }
}
