package lab_02.Test_13;

public abstract class ComputerAverage {
    abstract void average(double chiGrade, double mathGrade, double engGrade);
    public static void main(String[] args) {
        Gymnastics gymnastics = new Gymnastics();
        gymnastics.average(98.3,96.2,89.8);
        School school = new School();
        school.average(91,95.6,93.7);
    }
}
