package lab_02.day20190912;

public class User {
    User(String name,int age){
        System.out.println("他是"+name+",他今年"+age+"岁");
    }
    public static void main(String[] args) {
        User student=new User("官",20);
        Student man=new Student();
        man.sleep();
    }

}

class Student{
    int age;
    String name;

    Student(){


    }
    public void sleep(){
        this.age=10;


    }
}