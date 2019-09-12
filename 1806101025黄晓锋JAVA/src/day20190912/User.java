package day20190912;

public class User {
    String name;
    int age;

    User(){

    }

    User(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(name + " " + " " + age);
    }

    void stduy(){
        System.out.println("这是一个study！");
    }

//    public static void main(String[] args) {
//        User user = new User("huang" , 20);
//        user.name = "huang";
//        user.age = 20;
//      }
}
