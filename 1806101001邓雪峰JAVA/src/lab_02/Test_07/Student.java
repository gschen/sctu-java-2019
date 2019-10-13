package lab_02.Test_07;

public class Student extends Person {
    String Snumber;
    String school;

    String theSnumber(){
        return Snumber;
    }
    String theSchool(){
        return school;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.age = 18;
        student.idCard = "1806101111";
        student.name = "snow";
        student.Snumber = "18111";
        student.school = "SCTU";

        System.out.println(student.theSchool());
        System.out.println(student.theSnumber());
        System.out.println(student.theIdCard());
        System.out.println(student.theName());
        System.out.println(student.theAge());
    }
}
