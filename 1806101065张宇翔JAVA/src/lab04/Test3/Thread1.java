package lab04.Test3;

public class Thread1 extends java.lang.Thread {

    @Override
    public void run() {
        while (true){
            System.out.println("Hello,World!");

            try {
                Thread1.sleep(1000);
            }catch (Exception e){
                System.out.println("发生异常！");
            }
        }
    }
}
