package day20191017;



public class Test_02 extends Thread {
    @Override
    public void run() {
        //线程属性
        this.getName();//获得当前你线程的名字
        this.getId();//获得当前线程的编号
        System.out.println("这是一个继承了Thread类的线程！");
        for (int i = 0; i <= 20; i++){
            try {
                Thread.sleep(100);//sleep函数可以实现延时运行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + i);
        }
    }
}
