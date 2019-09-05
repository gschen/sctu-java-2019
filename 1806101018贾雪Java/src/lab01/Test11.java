package lab01;
import java.util.Scanner;
public class Test11 {
    public static void main(String[] args){
        int i;
        int d4,d3,d2,d1;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个1-9999之间的数：");
        i=sc.nextInt();
        //判断位数，JAVA中）把基本类型转化为对象类型的方法；返回对象的值；获取布尔型对象的值（返回值为布尔型）
//           for(int n=0;i>0;n++){
//               if (i/10==0){
//                   break;
//               }
//               System.out.println(i+""是一个位数为+n+"的数");
//
//           }
        String num = String.valueOf(i);
        System.out.println(i+"是一个位数为"+num.length()+"的数");
        //判断是不是回文数
        d4=i%10000/1000;
        d3=i%10000%1000/100;
        d2=i%100/10;
        d1=i%10;
        if(d1==d4 &&d2==d3)
        {
            System.out.println(i+"是回文数");
        }
        else if (d1==d3 &&d4==0){
            System.out.println(i+"是回文数");
        }
        else
        {
            System.out.println(i+"不是回文数");
        }




    }



}
