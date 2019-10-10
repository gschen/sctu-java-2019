package lab_02.day20190912;

public class Inherit {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setAge(18);
        dog.setName("旺财");
        System.out.println(dog.getName()+dog.getAge()+"岁");
    }

}
class Animal{
    private int age;
    private String name;
//    public Animal(int age,String name){
//        this.age=age;
//        this.name=name;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}


class Dog extends Animal{

}
