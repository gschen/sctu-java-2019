package day0912;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1=new Teacher();

        t1.name="teacher";   // 这是Teacher类里面继承的东西（也就是User类里的东西）
        t1.study();

        System.out.println(t1.name);
    }
}
