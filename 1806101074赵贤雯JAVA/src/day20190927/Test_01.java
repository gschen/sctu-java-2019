package day20190927;

public class Test_01 {
    // 1. 属性 成员变量
    int a;

    // 2. 行为 成员方法
    void study() {
    }

    //在运行之前出错的信息叫做编译错误
// 运行时出现的错误叫做运行时错误，exception
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 50) {
                try {
                    System.out.println(i/0);
                }catch (Exception e){
                    System.out.println(e.toString());
                }finally {
                    //不论是否报错都继续运行
                }
            }
        }
    }
}
