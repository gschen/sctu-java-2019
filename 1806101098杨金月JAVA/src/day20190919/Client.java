package day20190919;

public class Client {
    public static void main(String[] args) {
        double pi = Circle.PI;
        System.out.println(pi);

        System.out.println(Config.URL);//直接获得URL的值

        //USB接口，既USB创建接口后UsbDiskWriter实现接口。再在此处调用接口。
        USB usb = new UsbDiskWriter();
        usb.start();
        usb.stop();

        //类的继承
        ComputerAverage computerAverage = new Gymnastics() ;
        computerAverage.average();

        ComputerAverage co = new Sctucomputer();
        co.average();
        }
    }

