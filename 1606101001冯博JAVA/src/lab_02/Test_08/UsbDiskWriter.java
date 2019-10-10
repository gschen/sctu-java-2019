package lab_02.Test_08;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import day20190919.Usb;

public class UsbDiskWriter implements Usb{
    @Override
    public void start() {
        System.out.println("Usb Disk Writer start!");
    }
    @Override
    public void stop() {
        System.out.println("Usb disk writer stop!");
    }
}
