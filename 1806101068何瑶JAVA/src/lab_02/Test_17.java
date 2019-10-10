package lab_02;
import java.util.Scanner;
public class Test_17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("请输入10个整数");
        for (int i=0;i<10;i++){
            a[i]=s.nextInt();
        }
        int max=a[0];
        int min=a[0];
        int maxwz=0;
        int minwz=0;
        int sum=0;
        for(int j=0;j<a.length;j++) {
            if (a[j] > max) {
                max = a[j];
                maxwz = j + 1;
            }
            if (a[j] < min) {
                min = a[j];
                minwz = j + 1;
            }
            sum += a[j];
        }
        System.out.println("最大值为："+max);
        System.out.println("最大值为第"+maxwz+"元素");
        System.out.println("最小值为："+min);
        System.out.println("最小值为第"+minwz+"元素");
        System.out.println("所有元素的总和为："+sum);
    }
}

