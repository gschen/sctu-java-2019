package Practice.day20190912;

public class User {
    User(){

    }
    User(int age,String name,String birthday){
        this.age = age;
        this.name = name;
        this.birthday = birthday;
       // System.out.println("这是构造函数");
    }
    private String name;
    private int age;
    private String birthday;

    void messige(){
        System.out.println("名字为："+name+"年龄为："+age+"生日为："+birthday);
    }
    void sleep(){
        System.out.println("正在睡觉");
    }

}







