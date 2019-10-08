package lab_02.Test_07;

public class Student extends Person {
    private String school;
    private String studentId;
    private String name;
    private int age;
    private String personId;

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", personId='" + personId + '\'' +
                '}';
    }
}
