package lab02.test08;

//8、 	定义一接口名叫Usb，该接口声明了两个方法分别为start()和stop()方法，定义一U盘类UsbDiskWriter，
// 一照相机类Camera、一手机类Mobile，让它们都实现该接口。

interface Usb{
    public abstract int start(int a);   //只定义 不实现   且接口不能实例化
    public abstract int stop(int b);
}

class UsbDiskWriter implements Usb{
    public int start(int a){
        return 2 * a;
    }

    public int stop(int b){
        return 2 * b;
    }
}

class Camera implements Usb{
    public int start(int a){
        return 3 * a;
    }

    public int stop(int b){
        return 3 * b;
    }
}

class Mobile implements Usb{
    public int start(int a){
        return 4 * a;
    }

    public int stop(int b){
        return 4 * b;
    }
}

public class Test_1 {
    public static void main(String[] args) {
        UsbDiskWriter u1= new UsbDiskWriter();
        Camera c1=new Camera();
        Mobile m1=new Mobile();

        System.out.println("U盘类的start："+u1.start(2));
        System.out.println("U盘类的stop："+u1.stop(2));
        System.out.println("相机类的start："+c1.start(3));
        System.out.println("相机类的stop："+c1.stop(3));
        System.out.println("手机类的start："+m1.start(4));
        System.out.println("手机类的stop："+m1.stop(4));
    }
}
