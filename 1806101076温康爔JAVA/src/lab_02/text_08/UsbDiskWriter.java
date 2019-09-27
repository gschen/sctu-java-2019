package lab_02.text_08;

public class UsbDiskWriter implements Usb {
    @Override
    public void start() {
        System.out.println("usb disk writer start");
    }

    @Override
    public void stop() {
        System.out.println("usb disk writer stop");
    }
}

