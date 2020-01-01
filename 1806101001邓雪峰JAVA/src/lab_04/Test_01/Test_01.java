package lab_04.Test_01;

public  class Test_01 extends Thread {
    @Override
    public void run(){
        for (int i =0;i<20;i++){
            System.out.println("Hello, World!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test_01 test_01 = new Test_01();
        test_01.run();
    }
}
