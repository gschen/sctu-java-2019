package lab_02.test_07;

public class Person {
    //属性

    public String name;
    public int age;
    public String ID;

    public Person(String name,int age,String ID){
        this.name=name;
        this.age=age;
        this.ID=ID;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String getID(){
        return ID;

    }
    public void test(){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("身份证号："+ID);
    }

}
