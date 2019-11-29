package lab04.Tset1;

public class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("这是第一个继承了Thread类的线程。");

        while (true){
            System.out.println(this.getName() + "Hello,World!" + " ");     //this.getName  获得当前线程的名字

            try {
                Thread.sleep(1000);      //打印1次，休息1秒
            } catch (Exception e) {
                System.out.println("发生异常！");
            }
        }
    }
}
