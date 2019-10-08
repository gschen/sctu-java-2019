package lab_02.Test_17;

public class Test_17 {
    public static void main(String[] args) {
        int[] value=new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("数组最大值为"+getMax(value)+",数组最小值为"+getMin(value));
    }
    public static int getMax(int[] value){
        int max=value[0];
        for (int j = 0; j <value.length ; j++) {
            if (max<value[j]){
                max=value[j];
            }
        }
        return max;
    }
    public static int getMin(int[] value){
        int min=value[0];
        for (int i = 0; i <value.length ; i++) {
            if (min>value[i]){
                min=value[i];
            }
        }
        return min;
    }
}
