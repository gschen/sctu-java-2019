package Practice.day20190912;

public class Client {
    public static void main(String[] args) {
        User liu = new User(19,"liu","9.1");
        liu.messige();
        liu.sleep();
        User zen = new User(19,"zen","5.1");
        zen.messige();
        zen.sleep();


    }
    static class Test{
        public static void main(String[] args) {
            Students zhang = new Students();
            zhang.name = "zhang";
            zhang.setName();
            zhang.sno = "73";
            zhang.setSno();
            zhang.sclass = "class3";
            zhang.setSclass();
        }
    }


}
