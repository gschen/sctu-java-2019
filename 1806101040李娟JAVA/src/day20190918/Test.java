package day20190918;

public class Test {
    public static void main(String[] args) {
        double pi=Test01.PI;   // static 修饰成员变量 不需要实例化 直接Test01.PI获取

        System.out.println(pi);
        System.out.println(Test01.A);  //可以直接类.名字获取；不需要实例化
        System.out.println(Test01.add());// 运行方法同理
    }
}
