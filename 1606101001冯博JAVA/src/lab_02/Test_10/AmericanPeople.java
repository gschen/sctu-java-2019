package lab_02.Test_10;

public class AmericanPeople extends People{
    void privateInfo(String name, String country,String sex,int age){
        System.out.println("姓名：" + name + "\n" +
                "国籍："+ country + "\n" +
                "性别：" + sex + "\n" +
                "年龄：" + age);
    }
}
