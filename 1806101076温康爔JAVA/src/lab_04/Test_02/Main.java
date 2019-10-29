package lab_04.Test_02;

public class Main {
    public static void main(String[] args) {

            ThreadImp1 threadImp1 = new ThreadImp1();
            ThreadImp2 threadImp2 = new ThreadImp2();

            Thread thread1 = new Thread(threadImp1);
            Thread thread2 = new Thread(threadImp2);

            thread1.start();
            thread2.start();

    }
}
