package day20191017;

// 实现一个接口
public class Te07 implements Runnable {

    private int startNo = 1;

    public Te07(int startNo) {
        this.startNo = startNo;
    }

    @Override
    public void run() {

        for (int i = startNo; i <  startNo + 20; i++) {
            System.out.println(  i);
        }

    }
}
