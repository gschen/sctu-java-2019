package day20190919;

public class UsbDiskWriter implements USB{
    @Override
    public void start() {
        System.out.println("usb disk writer start!");
    }

    @Override
    public void stop() {
        System.out.println("usb disk write stop!");
    }
    //alt+enter

}
