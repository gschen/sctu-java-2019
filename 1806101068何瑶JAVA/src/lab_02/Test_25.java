package lab_02;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
class Test_25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个数字：");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        try{
            System.out.println(divide(a,b));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static double divide(double x,double y)throws Exception{
        if (y==0){
            Exception e=new Exception("除数为零");
            throw e;
        }
        return x/y;
    }
}
