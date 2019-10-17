package Lab_02.Test_026;
//26、 	编写一个类ExceptionTest，在main方法中使用try、catch、finally：
//        1)	在try块中，编写被0除的代码；
//        2)	在catch块中，捕获被0除所产生的异常，并且打印异常信息；
//        3)	在finally块中，打印一条语句。

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        try{
            System.out.println(10 / 0);
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }finally {
            System.out.println("好好学一学数学！弟弟");
        };
    }
}
