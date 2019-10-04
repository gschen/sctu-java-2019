package day20190927;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class Test1 {
    //属性，成员变量
    int a;
    //list b;

    //行为，成员方法
    void study(){}
    //ggg 运行之前出错信息：编译错误,Error
    //运行过程中出错：运行时错误，Exception


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);

            if (i==50){
               try{//可能出现的错误
                   int[] a=new int[5];
                   a[6]=10;
                   System.out.println(i/0);
               }
               catch (Exception e){//捕捉错误(expection可捕捉任何错误)
                   System.out.println(e.toString());
               }
               finally {//不管出错与否，最终都会被执行

               }
            }
        }
    }
}

