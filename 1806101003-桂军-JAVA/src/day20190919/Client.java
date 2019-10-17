package day20190919;

public class Client {
    public static void main(String[] args) {
        double pi = Circle.PI;
        System.out.println(pi);
        System.out.println(Config.URL);
        Config.printInfo();


        UsbDiskWriter usbDiskWriter = new UsbDiskWriter();
        USB usb = new UsbDiskWriter();
        usb.start();
        usb.stop();

    }
}
