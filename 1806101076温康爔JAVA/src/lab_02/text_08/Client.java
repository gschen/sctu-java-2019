package lab_02.text_08;

public class Client {
    public static void main(String[] args) {
        UsbDiskWriter usbDiskWriter = new UsbDiskWriter();
        usbDiskWriter.start();
        usbDiskWriter.stop();

        Camera camera = new Camera();
        camera.start();
        camera.stop();

        Mobile mobile = new Mobile();
        mobile.start();
        mobile.stop();
    }
}
