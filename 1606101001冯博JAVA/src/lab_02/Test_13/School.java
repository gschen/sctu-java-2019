package lab_02.Test_13;

public class School extends ComputerAverage {
    double average;
    @Override
    void average(double chiGrade, double mathGrade, double engGrade) {
        average = (chiGrade + mathGrade + engGrade)/3;
        System.out.println("平均成绩： " + average);
    }
}
