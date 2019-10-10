package lab_02;

public interface Usb {
    public void start();
    public void stop();
}
class Camera implements Usb{
    public void start(){
        System.out.println("照相机开始工作");
    }
    public void stop(){
        System.out.println("照相机停止工作");
    }
}
class UsbDiskWriter implements Usb{
    public void start(){
        System.out.println("U盘开始工作");
    }
    public void stop(){
        System.out.println("U盘停止工作");
    }
}
class Mobile implements Usb{
    public void start(){
        System.out.println("手机开始工作");
    }
    public void stop(){
        System.out.println("手机停止工作");
    }
}
class Test2
{
    public static void main(String[] args) {
        Camera c=new Camera();
        c.start();
        c.stop();
        Usb u=new UsbDiskWriter();
        u.start();
        u.stop();
        Mobile m=new Mobile();
        m.start();
        m.stop();
            }
        }

