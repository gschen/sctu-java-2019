package lab_02.Test_08;



public class UsbDiskWriter implements USB{
    @Override
    public void start() {
        System.out.println("Usb Disk Writer start!");
    }
    @Override
    public void stop() {
        System.out.println("Usb disk writer stop!");
    }
}
