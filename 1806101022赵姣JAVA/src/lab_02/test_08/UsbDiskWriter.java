package lab_02.test_08;

public class UsbDiskWriter implements USB {//  快捷键ALT+ENTER
    @Override
    public void start() {
        System.out.println("usb disk writer start!");

    }

    @Override
    public void stop() {
        System.out.println("usb disk writer stop!");
    }
}
