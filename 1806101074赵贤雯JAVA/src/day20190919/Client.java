package lab_02.day20190919;

public class Client {
    public static void main(String[] args) {
        double pi = Circle.PI;
        System.out.println(pi);

        System.out.println(Config.URL);//使用static可以直接调用
        Config.printInfo();
        //Config.hello();未使用static就会报错

        UsbDiskWriter usbDiskWriter = new UsbDiskWriter();
        USB user = new UsbDiskWriter();
        user.start();
        user.stop();
        ComputerAverage computerAverage = new Gymnastics();
        computerAverage.average();
    }
}
