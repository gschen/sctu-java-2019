package day20190919;
//专门定义一个类来装常量，用static来修饰，方便直接调用。
public class Config {
    static String  name = "houshuai";
    static int age = 19;
    static String sex = "男";
    static void getInfor(){
        System.out.println("姓名是:"+name+"\n"+"年龄是："+age+"\n"+"性别是："+sex);
    }

}
