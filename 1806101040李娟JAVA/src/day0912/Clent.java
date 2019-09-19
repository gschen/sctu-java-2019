package day0912;


//Clent 是 User的一部份
public class Clent {
    public static void main(String[] args) {

        //在User里按ctrl+b  会跳回构造函数的地方
        //输出时先输出构造函数 在输出其他函数
        User u1=new User("hahahah"); //对象实例化

        u1.study();
        u1.userName();

    }
}
