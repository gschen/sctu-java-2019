package day20190905;

public class Test01 {

     static int add(int a,int b){//main函数里调用 函数前必须加static;
        return a+b;
    }

    //main函数 程序运行入口
    public static void main(String[] args) {

        int c=add(1,2);
        System.out.println(c);

    }

}
