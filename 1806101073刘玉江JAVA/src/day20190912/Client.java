package day20190912;

public class Client {
    public static void main(String[] args) {
        User liu = new User(19,"liu","9.1");
        liu.messige();
        liu.sleep();
        User zen = new User(19,"zen","5.1");
        zen.messige();
        zen.sleep();
    }
}
