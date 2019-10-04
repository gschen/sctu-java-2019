package lab_02.test_07;

public class Person {
    //成员变量
    //人名、年龄、身份证号
    private String name;
    private int age;
    private  String idno;
    public Person(String name,int age,String idno){
        this.name=name;
        this.age=age;
        this.idno=idno;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }

    public String getIdno(){
        return idno;
    }
    public void setIdno(String idno){
        this.idno=idno;
    }

    public String getInfo(){
        return "姓名："+getName()+"年龄："+getAge()+"身份证号："+getIdno();
    }
}
