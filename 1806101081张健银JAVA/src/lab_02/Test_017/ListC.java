package lab_02.Test_017;
//17、 	定义一个10个元素组成的一维数组，输出该数组中的最大值、最小值、所有元素总和，以及最大值和最小值在该数组中的位置。
import java.util.Arrays;
import java.util.Scanner;

public class ListC {
    Double[] a = new Double[10];

    public void add(){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数组元素");
        for (int i = 0; i < a.length; i++) {
            Double o = s.nextDouble();
            a[i] = o;
        }
        System.out.println("当前数组为：" + Arrays.toString(a));
    }

    public void max(){
        double max = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
                index = i;
            }
        }
        System.out.println("当前数组最大值为：" + max);
        System.out.println("当前数组最大值索引为：" + index);

    }

    public void min(){
        double min = a[0];
        int index = 0;
        for (int i = 0; i < a.length ; i++) {
            if(a[i] < min){
                min = a[i];
                index = i;
            }
        }
        System.out.println("当前数组的最小值为：" + min);
        System.out.println("当前数组最小值索引为：" + index);
    }

    public void all(){
        double all = 0;
        for (int i = 0; i < a.length; i++) {
            all += a[i];
        }

        System.out.println("当前数组总和为：" + all);
    }

}
