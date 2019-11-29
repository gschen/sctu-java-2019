package lab04.Tset1;

import lab04.Tset1.Runnable1;

public class Tset02 {
    public static void main(String[] args) {
        System.out.println("这是一个使用了Runnable的线程");
        Thread test02 = new Thread(new Runnable1());
        test02.run();
    }
}


