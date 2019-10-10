package lab_02.day20190919;
//光标放在报错处按下alt+enter 再一直回车则会出现新的代码
public class UsbDiskWriter implements USB{
    @Override
    public void start() {
        System.out.println("usb disk writer start!");
    }

    @Override
    public void stop() {
        System.out.println("usb disk writer stop!");
    }
}
