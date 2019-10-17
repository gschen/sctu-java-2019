package day20191017;

public class Test_01 extends Thread {
    private int start;
    public Test_01(int start){
        this.start=start;
    }


    @Override
    public void run() {
        for (int i = start; i <start+20 ; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
