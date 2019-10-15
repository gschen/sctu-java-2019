package lab_02.Test_17;

public class Array {
    public static void main(String[] args) {
        int[] ints = new int[10];
        int min;
        for(int i=0;i<(ints.length-1);i++){
            for (int p=0;p<(ints.length-1-i);p++){
                if (ints[p] > ints[p+1]) {
                    int max = ints[p];
                    ints[p] = ints[p+1];
                    ints[p+1] = max;
                }
                else{

                }
            }
        }
    for(int a:ints){
        System.out.println("第"+a+"个数为："+a);
    }
    }
}
