package day20190919.test_8;

public class Camera implements USB {


    @Override
    public void start() {
        System.out.println("Camera USB start");
    }

    @Override
    public void stop() {
        System.out.println("Camera USB stop");
    }
}
