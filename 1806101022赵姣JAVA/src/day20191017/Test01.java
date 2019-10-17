package day20191017;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                try {
                    if (i == 50) {
                        try {
                            System.out.println(i / 0);
                        } catch (ArithmeticException e) {
                            System.out.println("除0错误！");
                        } finally {
                            //不管出错与否，最终都会被执行
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}