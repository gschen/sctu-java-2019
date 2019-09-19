package day20190919;
//实现USB接口
public class UsbDiskWriter implements USB {//光标 alt enter.有方法
    @Override
    public void start() {
        System.out.println("usb disk writer start!");
    }

    @Override
    public void stop() {
        System.out.println("usb disk writer stop!");

    }
}
