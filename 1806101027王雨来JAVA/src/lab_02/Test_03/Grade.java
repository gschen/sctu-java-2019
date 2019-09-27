package lab_02.Test_03;
import java.math.*;
/*3、 	设计一个表示学生的类，里面有学生的三项成绩：计算机成绩、数学成绩、英语成绩。
        要求可以求总分、平均分、最高分、最低分，并且可以输出一个学生的完整信息。*/
public class Grade {
    float com;
    float mat;
    float eng;
    float rotal(){
        return this.com+this.mat+this.eng;
    }
    float averageNum(){
        return (this.com+this.mat+this.eng)/3;
    }
    float maxNum(){
        float x = this.com;
        if (this.mat > x) {
            x = this.mat;
        }
        if (this.eng > x) {
            x = this.eng;
        }
        return x;
    }
    float minNum(){
        float x = this.com;
        if (this.mat < x) {
            x = this.mat;
        }
        if (this.eng < x) {
            x = this.eng;
        }
        return x;
    }
    void printOut(){
        System.out.println("计算机："+ com
                + "\n数学：" + mat
                + "\n英语：" + eng
                + "\n总分：" + this.rotal()
                + "\n平均分：" + this.averageNum()
                + "\n最高分：" + this.maxNum()
                + "\n最低分：" + this.minNum());
    }

    public static void main(String[] args) {
        Grade someone = new Grade();
        someone.com = 92;
        someone.mat = 89;
        someone.eng = 88;
        someone.printOut();
    }
}
