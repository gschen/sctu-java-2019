package day20190927;

import javafx.scene.chart.ScatterChart;

public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);

            if (i == 50) {
                try {
                    throw new NullPointerException();//直接抛出一个错误
                }
                catch (NegativeArraySizeException e){
                    System.out.println("空指针错误！");
                }
                finally {

                }
            }
        }
    }
}
