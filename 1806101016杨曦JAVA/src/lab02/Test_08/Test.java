package lab02.Test_08;

public class Test {
    public static void main(String[] args) {
        Camera c=new Camera() ;
        c.start();
        c.stop();
        USB u=new USBDiskWriter() ;
        u.start();
        u.stop();
        Mobile m=new Mobile() ;
        m.start();
        m.stop();


    }
}
