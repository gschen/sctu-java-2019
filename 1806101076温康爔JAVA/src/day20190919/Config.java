package day20190919;

public class Config {
    static String URL = "www.sctu.edu.cn";
    static int PORT=8080;
    static String PROTOCOL="HTTPS";

    static void printInfo(){
        System.out.println("Info");
    }
    static void hello(){//未使用static会报错
        System.out.println(20);
    }
    static void DL(){
        System.out.println("DL");
    }
}