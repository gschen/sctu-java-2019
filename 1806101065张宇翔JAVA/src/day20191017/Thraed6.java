package day20191017;

public class Thraed6 extends Thread{
    private int startNo;

    public Thraed6(int startNo) {
        this.startNo = startNo;
    }

    @Override
    public void run() {
        for (int i = startNo; i < startNo+20; i++){
            System.out.println(this.getName() + " : " + i);
        }
    }
}
