package lab_02;
import java.util.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Score {
    //1.属性
    double computerGrade;
    double mathGrade;
    double englishGrade;
    double totalPoints;
    //2.成员方法
    void totalPoints(){
        System.out.println("该学生的总分为: " + this.totalPoints);
    }
    void averageScore(){
        System.out.println("学生的平均分为： " + this.totalPoints/3);
    }
    void topScore(){
        System.out.println("学生的最高分为： " + Math.max(this.computerGrade,this.englishGrade,this.mathGrade));
    }


    /*
    void topScore(){
        if (this.computerGrade>this.englishGrade&&this.computerGrade>this.mathGrade){
            System.out.println("学生的最高分为： " + this.computerGrade);
        }else if(this.englishGrade>this.computerGrade&&this.englishGrade>this.mathGrade){
            System.out.println("学生的最高分为： " + this.englishGrade);
        }else {
            System.out.println("学生的做高分： " + this.mathGrade);
        }
    }
    void lowestScore(){}
    */

    public static void main(String[] args) {
        Score student1 = new Score();
        student1.englishGrade = 95.5;
        student1.mathGrade = 85.3;
        student1.computerGrade = 99.2;
        student1.totalPoints = student1.computerGrade + student1.mathGrade + student1.englishGrade;
        student1.totalPoints();
        student1.averageScore();
        student1.topScore();
    }
}
