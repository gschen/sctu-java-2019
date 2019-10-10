package day20190927;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test_03 {

    static void work(int i) throws ArithmeticException {
        System.out.println(i);
        if (i == 50) {
            System.out.println(i / 0);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            work(i);
            if (i == 50) {
                try {

                    System.out.println(i / 0);
                } catch (ArithmeticException e) {
                    System.out.println("除 0 错 误 ！");
                } finally {
                }
            }
        }
    }
}
