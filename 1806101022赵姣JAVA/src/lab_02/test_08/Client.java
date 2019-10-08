package lab_02.test_08;

public class Client {
    public static void main(String[] args){
        UsbDiskWriter usbDiskWriter = new UsbDiskWriter();
        usbDiskWriter.start();
        usbDiskWriter.stop();

        /*UsbDiskWriter usbDiskWriter = new UsbDiskWriter();

        USB usb=new UsbDiskWriter();
        usb.start();
        usb.stop();*/
        Camera camera = new Camera();
        camera.start();
        camera.stop();


        Mobile mobile = new Mobile();
        mobile.start();
        mobile.stop();
}
}
