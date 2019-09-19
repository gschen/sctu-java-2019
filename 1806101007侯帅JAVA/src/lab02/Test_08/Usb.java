package lab02.Test_08;

 interface Usb {//定义一个接口
     void start();//定义接口的方法
     void stop();
}
 class UsbDiskWriter implements Usb {
     public void start(){
         System.out.println("这是开始");
     }
     public void stop(){
         System.out.println("这是终止");
     }
}
class Camera implements Usb{
     public void start(){
         System.out.println("这是开始");
     }
     public void stop(){
         System.out.println("这是终止");
     }
}
class Mobile implements Usb{
     public void start(){
         System.out.println("这是开始");
     }
     public void stop(){
         System.out.println("这是结束");
     }
        }
        class Test{
            public static void main(String[] args) {
                UsbDiskWriter A = new UsbDiskWriter();
                A.start();
                A.stop();
            }
        }

