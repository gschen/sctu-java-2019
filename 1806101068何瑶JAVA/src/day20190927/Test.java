package day20190927;

public class Test {
    //1.属性，成员变量
    int a;
   // list b;
    //2.方法，成员方法
    void study(){}

    public static void main(String[] args) {
for(int i=0;i<100;i++){
    System.out.println(i);
    if (i==50){
        try {
            int[] a=new int[5];
            a[6]=10;
            System.out.println(i/0);
        }catch (ArrayIndexOutOfBoundsException  e){
            System.out.println("数组越界错误");
//不管错没错都会被执行
        }catch (ArithmeticException e){
            System.out.println("除零错误");
        }
        finally{}
    }
}
    }
}
