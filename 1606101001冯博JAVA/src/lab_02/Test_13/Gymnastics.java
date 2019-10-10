package lab_02.Test_13;

public class Gymnastics extends ComputerAverage{
    @Override
    void average(double chiGrade, double mathGrade, double engGrade) {
        if (chiGrade > mathGrade & chiGrade > engGrade) {
            if (mathGrade > engGrade) {
                System.out.println("平均成绩： " + mathGrade);
            } else {
                System.out.println("平均成绩： " + engGrade);
            }
        }
        if (mathGrade > chiGrade & mathGrade > engGrade){
            if (chiGrade > engGrade){
                System.out.println("平均成绩： " + chiGrade);
            } else {
                System.out.println("平均成绩： " + engGrade);
            }
        }
        if (engGrade > mathGrade & engGrade > chiGrade){
            if (mathGrade > chiGrade){
                System.out.println("平均成绩： " + mathGrade);
            } else {
                System.out.println("平均成绩： " + chiGrade);
            }
        }
    }
}
