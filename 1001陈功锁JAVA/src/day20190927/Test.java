package day20190927;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by Administrator on 2019-9-27.
 */
public class Test {
    // 1. 属性，成员变量
    int a;
//    list b;


    // 2. 行为， 成员方法
    void study(){}
    //ggg 运行之前出错信息：编译错误
    // 运行过程中出错：运行时错误，Exception

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);

            if (i == 50){
                try{
                    int[] a = new int[5];
                    a[6] = 10;

                    System.out.println(i / 0);
                }catch (Exception e){
                    System.out.println(e.toString());
                } finally {

                    //不管出错与否，最终都会被执行。


                }
            }
        }






//        while(true){
//
//             work1();
//             work2();
//             10/0;
//
//        }
    }

}
