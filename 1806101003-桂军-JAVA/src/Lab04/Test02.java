package Lab04;

public class Test02 {
    public static class Example extends Thread {
        private String data;

        public Example(String data) {
            this.data = data;
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 1000));
                } catch (Exception e) {
                }
                System.out.print(data + " ");
            }
            System.out.println();
        }

        public static void main(String args[]) throws InterruptedException {
            Thread t1 = new Example("hello，world");
            Thread t2 = new Example("123456789");
            t1.start();
            t1.join();//等待t1执行完毕，在执行t2
            t2.start();
        }
    }
}

