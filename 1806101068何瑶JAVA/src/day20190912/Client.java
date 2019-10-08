package day20190912;

public class Client {
    public static void main(String[] args) {
        User he=new User("he",10);//对象实例化
        he.study();
        User yang=new User("yang",20);//对象实例化
        yang.study();
        User chen=new User("chen",30);
        chen.study();
    }
}