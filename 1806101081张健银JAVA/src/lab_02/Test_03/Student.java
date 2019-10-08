package lab_02.Test_03;
//3、 	设计一个表示学生的类，里面有学生的三项成绩：计算机成绩、数学成绩、英语成绩。要求可以求总分、平均分、最高分、最低分，并且可以输出一个学生的完整信息。
public class Student {
    private int computer;
    private int math;
    private int english;

    public Student(int computer,int math,int english){
        this.computer = computer;
        this.english = english;
        this.math = math;
    }

    public int score(){
        return computer + english + math;
    }

    public double average(){
        return score()/3;
    }

    public int max(){
        int score;
        if(computer > math){
            score = computer > english ? computer :english;
        }else {
            score = math > english ? math :english;
        }
        return score;
    }

    public int min(){
        int score;
        if(computer < math){
            score = computer < english ? computer : english;
        }else {
            score = math < english ? math : english;
        }
        return score;
    }

}
