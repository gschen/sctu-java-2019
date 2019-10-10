package lab_02.day20190919;

public class Config {
    //可以专门写一个类放成员变量，不用实例化就可以得到它的值
    static String URL = "www.sctu.edu.cn";

    static int PORT = 8080;

    static String PROTOCOL = "HTTPS";

    static void ptintInfo(){
        System.out.println("可以直接调用");
    }
    void print() {
        System.out.println("不能直接调用");
    }
}
