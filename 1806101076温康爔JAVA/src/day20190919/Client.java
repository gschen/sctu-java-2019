package day20190919;

public class Client {
    public static void main(String[] args) {
        double pi=Circle.PI;
        System.out.println(pi);

        System.out.println(Config.URL);
        Config.printInfo();
        Config.hello();
        Config.DL();

          USB usb = new USB(){
                  @Override
                  public void start() {

                  }

              @Override
              public void stop() {

              }
          };


        UsbDiskWriter usbDiskWriter=new UsbDiskWriter();

        USB user=new UsbDiskWriter();
        usb.start();
        usb.stop();

        ComputerAverage computerAverage=new Gymnastics();
        computerAverage.average();
        ComputerAverage co= new ComputerAverage();
        co.average();
    }
}
