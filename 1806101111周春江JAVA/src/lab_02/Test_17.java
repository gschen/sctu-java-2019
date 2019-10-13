package lab_02;

import java.util.Random;

public class Test_17 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[10];

        System.out.print("产生的随机数：");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);

            System.out.print(" " + arr[i] + " ");
        }

        int temp = 0;

        // 进行冒泡排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n");

        System.out.print("排序后的数组：");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i] + " ");
        }
        System.out.println("\n");
        System.out.println("最小值: " + arr[9] + "  最大值: " + arr[0]);
    }
}
