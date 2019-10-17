package day20190905;

public class Test01 {

   static int add(int a,int b){
       //static修饰符,自己定义一些函数时需要添加
       return  a+b;
   }

    //mian函数，程序运行的入口
    public  static  void  mian(String[] args){
        System.out.println("hello,world");
        int c=add(1,2);//若没有修饰词static则add会报错


    }
}
