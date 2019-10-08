package lab_02.test_08;

public class Camera implements USB{

    @Override
    public void start() {
        System.out.println("Camera start!");
    }

    @Override
    public void stop() {
        System.out.println("Camera stop!");

    }
}
