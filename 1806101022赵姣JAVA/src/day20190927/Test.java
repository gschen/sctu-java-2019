package day20190927;

public class Test {

    //1.属性  成员变量
    int a;

//2.行为
    void stdy(){}
    //运行之前出错信息：编译错误 ggg
    //运行过程中出错：运行时出错，exception

    public static void main(String[] args) {

        for(int i=0;i<100;i++){
            System.out.println(i);

            if(i==50){
                try {
                    System.out.println(i/0); }
                catch (ArithmeticException e){
                    System.out.println("除0错误！");
                }finally {
                    //不管出错与否，最终都会被执行
                }
            }
        }
    }

}
