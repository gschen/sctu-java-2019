package day20190829;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test_02 {
    public static void main(String[] args) {
       int i = 0;
       int j = 0;
        for(i = 1;i < 10;i++){

            for (j = 1;j <= i;j++){

        System.out.printf("%d*%d=%2d  ",j,i,i*j);  //printf
            }
        System.out.println();  //println自动换行
        }
    }
}
