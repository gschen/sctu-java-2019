package lab_02.Test_17;

public class Main {
    public static void main(String args[] ){
        int arr[]={1,9,7,8,6,4,5,3,2,1}, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int sum = 0;

        for (int j = 0;j<arr.length;j++){
            sum  += arr[j];
        }
        System.out.println("MAX="+max+", min="+min);
        System.out.println("总和为："+sum);
        for(int l = 0;l<arr.length;l++){
            if (max==arr[l]){
                System.out.println("最大值的下标为："+l);
            }
            if (min == arr[l]){
                System.out.println("最小值的下标为："+l);
            }
        }
    }
}
