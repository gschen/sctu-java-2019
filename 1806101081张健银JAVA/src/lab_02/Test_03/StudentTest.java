package lab_02.Test_03;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student(89,87,92);
        System.out.println(s.max());
        System.out.println(s.average());
        System.out.println(s.min());
        System.out.println(s.score());
    }
}
