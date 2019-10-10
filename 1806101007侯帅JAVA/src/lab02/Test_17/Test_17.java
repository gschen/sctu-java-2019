package lab02.Test_17;
import java.util.Arrays;
public class Test_17 {
    public static void main(String[] args) {
        int[] ints = {34,56,21,57,87,46,73,35,26,48};
        for (int i = 0; i < ints.length-1; i++) {
            for (int j = 0; j <ints.length-1-i ; j++) {
                int temp = 0;
                if (ints[j]>ints[j+1]){
                    temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
            }
        }
    }

        System.out.println(Arrays.toString(ints));
        System.out.println("最小值为："+ints[0]+"\n"+"" +
                "最大值为："+ints[ints.length-1]);

}}
