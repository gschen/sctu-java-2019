package day20190919.test_8;

public class UsbDiskWriter implements USB {

    @Override
    public void start() {
        System.out.println("UsbDiskWriter USB start");
    }

    @Override
    public void stop() {
        System.out.println("UsbDiskWriter USB stop");
    }
}
