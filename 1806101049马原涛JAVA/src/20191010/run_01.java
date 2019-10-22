public class run_01 extends Thread {

    private int count = 5;

    public run_01(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由 " + run_01.currentThread().getName() + " 计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        run_01 a = new run_01("A");
        run_01 b = new run_01("B");
        run_01 c = new run_01("C");
        a.start();
        b.start();
        c.start();
    }
}
