package lab_02.Test_010;

public class ChinaPeople extends People {
    private String name,language,local;
    private int age;

    public ChinaPeople(String name, String language, String local, int age) {
        this.name = name;
        this.language = language;
        this.local = local;
        this.age = age;
    }


    public void run(){
        System.out.println("中国人跑步");
    }
    public void eat(){
        System.out.println("中国人人吃饭");
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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
        return "ChinaPeople{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", local='" + local + '\'' +
                ", age=" + age +
                '}';
    }
}
