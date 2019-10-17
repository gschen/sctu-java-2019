package Lab02.Test17;

public class Test {
    public static void main(String[] args) {
        int[] data = {53,13,43,63,73,3,23,33,83,93,};//定义一个10大小的数组
        int max=0;//用来保存最大值
        int posOfMax=0;//用来保存最大值的位置
        int min=0;//用来保存最小值
        int posOfMin=0;//用来保存最小值的位置
        int sum=0;//用来保存总合

        for(int i=0;i<data.length;i++){
            if (i==0){
                max=data[i];
                posOfMax=i+1;
                min=data[i];
                posOfMin=i+1;
            }
            else{
                if (data[i]>max){
                    max=data[i];
                    posOfMax=i+1;
                }
                if (data[i]<min){
                    min=data[i];
                    posOfMin=i+1;
                }
            }
            sum=sum+data[i];
        }
        System.out.println("最大值为："+max);
        System.out.println("最大值为第"+posOfMax+"个元素");
        System.out.println("最小值"+min);
        System.out.println("最小值为第"+posOfMin+"个元素");
        System.out.println("所有元素总和为:"+sum);
    }

}
