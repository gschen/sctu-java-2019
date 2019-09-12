package lab_02;

public class Test_08 {
    interface Usb{
        public void start();
        public  void stop();
    }
    static class Camera implements Usb{
        public  void start(){
            System.out.println("照相机开始工作");
        }
        public void stop(){
            System.out.println("照相机停止工作");
        }
    }
    static class UsbDiskWriter implements Usb{
        public void start(){
            System.out.println("u盘开始工作");
        }
        public void stop(){
            System.out.println("U盘停止工作");
        }
    }
    static class mobile implements Usb{
        public void start(){
            System.out.println("手机开始工作");
        }
        public void stop(){
            System.out.println("手机停止工作");
        }
    }


    public static void main(String[] args) {
        Camera a = new Camera();
        a.start();
        a.stop();
        UsbDiskWriter b = new UsbDiskWriter();
        b.start();
        b.stop();
        mobile c = new mobile();
        c.start();
        c.stop();
    }


}
