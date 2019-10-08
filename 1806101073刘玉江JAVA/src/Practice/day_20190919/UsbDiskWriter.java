package Practice.day_20190919;

public class UsbDiskWriter implements Usb {
    @Override
    public void start() {
        System.out.println("usb disk writer start");
    }

    @Override
    public void stop() {
        System.out.println("sub disk writer start");
    }
}
