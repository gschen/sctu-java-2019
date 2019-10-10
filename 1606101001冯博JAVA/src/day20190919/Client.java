package lab_02.day20190919;

public class Client {
    public static void main(String[] args) {
        double pi = test_01.PI;  //可以直接调用 PI
        System.out.println(pi);
        System.out.println(Config.URL);

        Config.ptintInfo();

        Config config = new Config();
        config.print();
        Usb usb = new UsbDiskWriter();
        usb.start();
        usb.stop();
        ComputerAverage computerAverage = new Gymnastic();
        computerAverage.average();

    }
}
