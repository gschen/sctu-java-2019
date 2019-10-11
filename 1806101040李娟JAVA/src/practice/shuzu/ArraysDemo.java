package practice.shuzu;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //将数组元素都设为9
        Arrays.fill(arr, 9);
        System.out.println("fill:" + Arrays.toString(arr));
        Random random = new Random();  // 随机数
        for (int i = 0; i < arr.length; i++) {
            //使用100以内的随机数赋值数组 （随机数范围）
            arr[i] = random.nextInt(101);
        }
        //重新赋值后的数组
        System.out.println("重新赋值：" + Arrays.toString(arr));
        //将索引为5的元素设为50
        arr[5] = 50;
        //排序  sort为升序
        Arrays.sort(arr);
        //排序后的数组
        System.out.println("sort排序后：" + Arrays.toString(arr));
        //查找50的位置
        int i = Arrays.binarySearch(arr, 50);
        System.out.println("值为50的元素索引："+i);
        //复制一份新数组
        int[] newArr = Arrays.copyOf(arr, arr.length);
        //比较  数组元素值是否相等
        System.out.println("equals:"+Arrays.equals(arr, newArr));

        int[] ab = {6, 17, 92, 32, 58, 22, 84, 66, 36, 33};
        Arrays.sort(ab);
        System.out.println(Arrays.toString(ab));
        System.out.println("排序后的33的位置：" + Arrays.binarySearch(ab, 33));
    }
}
