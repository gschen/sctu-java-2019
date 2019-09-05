package day20190905;

public class Test01 {
    //调用了main函数，前面需要static修饰符
    //add（）{}前面加上返回值的类型如int ，（）里面写啥
    //{}里面写啥如返回return
    static int add(int a,int b){
        return a + b;

    }

    //main函数，程序运行的入口
    public static void main(String[] args) {

        System.out.println("hello,world");

        int c = add(1,2);
    }
}
