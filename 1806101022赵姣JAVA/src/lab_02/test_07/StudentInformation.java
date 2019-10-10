package lab_02.test_07;

public class StudentInformation {
    public static void main(String[] args) {
        //创建对象时同时传入参数
        Student s=new Student("张三",20,"180180180");
        s.number="000000";
        s.school="四川旅游学院";
        s.test();

    }
}
