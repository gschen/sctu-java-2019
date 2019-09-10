package Lab02.Test03;

public class Student {
    double computer;
    double math;
    double English;
    double sum;
    double average;
    float min;

    void sumGrade(){
        System.out.println("该学生的总成绩为："+sum);
    }
    void averageGrade(){
        System.out.println("该学生的平均成绩为："+average);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.computer=90;
        student.math=87;
        student.English=120;
        student.sum=student.computer+student.English+student.math;
        student.average=student.sum/3;
        student.sumGrade();
        student.averageGrade();

    }
}
