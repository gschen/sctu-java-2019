package Lab02.Test08;

public class Camera implements USB{
    @Override
    public void start() {
        System.out.println("按下快门");
    }

    @Override
    public void stop() {
        System.out.println("松开快门");
    }
}
