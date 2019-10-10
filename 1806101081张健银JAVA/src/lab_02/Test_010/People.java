package lab_02.Test_010;
//10、 	定义父类People，分别定义People类的子类ChinaPeople， AmJericanPeople和BeiJingPeople
//        并分别重写父类中的各个方法。最后在主方法中分别创建各子类的对象并调用各自的方法打印输出信息。
public class People {
    private String name,language;
    private int age;
    public People(){}
    public People(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }

    public void run(){
        System.out.println("人跑步");
    }
    public void eat(){
        System.out.println("人吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
