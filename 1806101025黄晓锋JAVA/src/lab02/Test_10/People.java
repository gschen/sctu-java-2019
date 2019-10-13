package lab02.Test_10;

public abstract class People {

    String name;
    int age;
    String id;

    void walk(){
        System.out.println(name+"可以行走");
    }

    void  swimming(){
        System.out.println(name+"可以游泳");
    }

    void String(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    void People(){
        System.out.println(name+"是人");
    }
}