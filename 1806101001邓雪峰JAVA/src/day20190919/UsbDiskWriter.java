package day20190919;

public class UsbDiskWriter  implements USB{
    @Override
    public void start() {
        System.out.println("usb disk writer is start!");
    }

    @Override
    public void stop() {
        System.out.println("usb disk writer is stop!");

    }//alt + enter

}
