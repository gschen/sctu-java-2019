package day20191017;

public class Test01 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <20 ; i++) {
            System.out.println(i);
        }
    }
}

class T02 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 20; i <39 ; i++) {
            System.out.println(i);
        }
    }
}
class T03 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 40; i <59 ; i++) {
            System.out.println(i);
        }
    }
}
class T04 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 60; i <79 ; i++) {
            System.out.println(i);
        }
    }
}
class T05 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 80; i <100 ; i++) {
            System.out.println(i);
        }
    }
}