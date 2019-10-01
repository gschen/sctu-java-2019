package lab_02.Test_010;

public class BeiJingPeople extends People{
    private String name,language;
    private int age;

    public BeiJingPeople(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }


    public void run(){
        System.out.println("北京人跑步");
    }
    public void eat(){
        System.out.println("北京人吃饭");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "BeiJingPeople{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                '}';
    }
}
