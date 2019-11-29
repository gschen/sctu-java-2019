package caogao;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        float [] nums = {1.1f,2.2f,3.3f};

        for (int i =0; i < 3; i++) {  // i++运行完之后再加
            System.out.print(nums[i]+" ");
        }

        int a[] = {1, 5, 3};
        System.out.println(Arrays.toString(a));  //  Arrays.toString() 将数组打印出来

//        for (int i = 0; i < 2; i++)
//            System.out.print( nums[i] + " "); // 这个打印出来只有1.1 和2.2
    }
}
