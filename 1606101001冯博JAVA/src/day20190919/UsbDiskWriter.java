package lab_02.day20190919;

public class UsbDiskWriter implements Usb{
    @Override
    public void start() {
        System.out.println("Usb Disk Writer start!");
    }

    @Override
    public void stop() {
        System.out.println("Usb disk writer stop!");
    }
    // alt + enter
}
