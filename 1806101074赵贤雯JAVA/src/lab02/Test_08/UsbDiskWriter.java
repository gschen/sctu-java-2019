package lab02.Test_08;

public class UsbDiskWriter implements USB {
    @Override
    public void start() {
        System.out.println("开始");
    }

    @Override
    public void stop() {
        System.out.println("结束");
    }
}
