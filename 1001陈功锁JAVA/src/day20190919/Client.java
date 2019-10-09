package lab_02.day20190919;

/**
 * Created by Administrator on 2019-9-19.
 */
public class Client {

    public static void main(String[] args) {

        double pi = Circle.PI;
        System.out.println(pi);


        System.out.println(Config.URL);

        Config.printInfo();

//        Config.hello();

//        USB usb = new USB();

        UsbDiskWriter usbDiskWriter = new UsbDiskWriter();

        USB usb = new UsbDiskWriter();
        usb.start();
        usb.stop();

        ComputerAverage computerAverage =
                new Gymnastics();
        computerAverage.average();

        ComputerAverage co = new SctuComputer();
        co.average();






    }
}
