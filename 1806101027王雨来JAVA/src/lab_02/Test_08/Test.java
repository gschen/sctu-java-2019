package lab_02.Test_08;

public class Test {
    public static void main(String[] args) {
        UsbDiskWriter usbDiskWriter = new UsbDiskWriter();
        Usb usb = new UsbDiskWriter();
        usb.start();
        usb.stop();
    }

}
