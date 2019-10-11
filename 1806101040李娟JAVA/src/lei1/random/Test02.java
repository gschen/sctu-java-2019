package lei1.random;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n0,n1,n2,v0;
        n0= n1= n2 = 0;
        for (int i = 0; i < 60 ; i++) {
            v0 = rand.nextInt(3);
            System.out.println("第" + i + "个随机数=" + v0);
            switch (v0){
                case 0:
                    n0++;
                    break;
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
            }
        }
        System.out.println("状态0的可能性：" + n0 * 1.0 / (n0 + n1 +n2));
        System.out.println("状态1的可能性：" + n1 * 1.0 / (n0 + n1 +n2));
        System.out.println("状态2的可能性：" + n2 * 1.0 / (n0 + n1 +n2));
    }
}
