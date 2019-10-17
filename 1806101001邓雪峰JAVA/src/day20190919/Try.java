package day20190919;

public class Try {
    public static void main(String[] args) {
        Ex.number = 200;
        System.out.println(Ex.URL);
        System.out.println(Ex.number);
        //USB usb = new USB();接口不能实例化
        UsbDiskWriter usbDiskWriter = new UsbDiskWriter();
        USB user = new UsbDiskWriter();
        //调类之后，在已经调用接口的基础上，再调用这个类，才能使得这接口进行实例化
        user.start();
        user.stop();;

       ComputerAverage computerAverage = new Gymnastic();
       computerAverage.average();
       //使用继承抽象类，再进行实例，建立在继承基础上

        ComputerAverage co = new CctuComputer();
        co.average();

        String name = "i like i like things";
        System.out.println("字符串长度："+name.length());

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));
        System.out.println(name.indexOf("l"));
        System.out.println(name.indexOf("like"));

        String[] wrod =  name.split("");
    }

}
