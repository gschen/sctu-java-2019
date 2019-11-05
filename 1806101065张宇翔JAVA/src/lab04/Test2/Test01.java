package lab04.Test2;

public class Test01 implements Runnable{
        boolean flag=true;
        int x = 10;
        public void run() {
            if(flag) {
                while(true) {
                    System.out.println("A");
                    try {
                        x--;
                        Thread.sleep(1000);
                    } catch(Exception e) {

                    }
                }
            }
            else {
                while(true) {
                    System.out.println("B");
                    try {
                        x--;
                        Thread.sleep(1000);
                    }
                    catch(Exception e) {

                    }
                }
            }
        }
    }

