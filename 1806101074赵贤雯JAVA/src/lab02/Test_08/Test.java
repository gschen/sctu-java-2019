package lab02.Test_08;

public class Test {
    public static void main(String[] args) {
        UsbDiskWriter usbDiskWriter = new UsbDiskWriter();
        Camera camera = new Camera();
        USB usb = new UsbDiskWriter();
        Mobile mobile = new Mobile();
        camera.start();
        mobile.stop();
    }
}
