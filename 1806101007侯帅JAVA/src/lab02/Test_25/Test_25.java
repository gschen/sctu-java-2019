package lab02.Test_25;

import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test_25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数：");
        double a = sc.nextDouble();
        double b = sc.nextDouble();//写两个输入 可以分别输入两个值 以回车隔开
        try {
            System.out.println(divide(a,b));//调用定义的除法函数

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static  double divide(double x,double y) throws Exception{
//定义一个除法函数
        if (y == 0){
            Exception e = new Exception("你的除数为0了哟");
            throw e;
        }
        return x/y;
    }
}
