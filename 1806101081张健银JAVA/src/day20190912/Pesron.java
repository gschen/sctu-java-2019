package day20190912;

public class Pesron {
    private String name,personCode,sex,work;
    private int age;
    public Pesron(){}
    public Pesron(String name, String personCode, String sex, String work, int age) {
        this.name = name;
        this.personCode = personCode;
        this.sex = sex;
        this.work = work;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pesron{" +
                "name='" + name + '\'' +
                ", personCode='" + personCode + '\'' +
                ", sex='" + sex + '\'' +
                ", work='" + work + '\'' +
                ", age=" + age +
                '}';
    }

    public void run(){
        System.out.println("人跑步");
    }
}
