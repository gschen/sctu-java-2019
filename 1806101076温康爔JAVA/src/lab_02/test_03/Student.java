package lab_02.test_03;

//3、 	设计一个表示学生的类，里面有学生的三项成绩：计算机成绩、数学成绩、英语成绩。
// 要求可以求总分、平均分、最高分、最低分，并且可以输出一个学生的完整信息。

public class Student {
    //1.成绩
    //计算机成绩、数学成绩、英语成绩
    private String name;
    private double pc;
    private double math;
    private double eng;

    public Student(String name, double pc, double math, double eng) {

        this.name = name;
        this.pc = pc;
        this.math = math;
        this.eng = eng;
    }
    public void sum() {
        System.out.println("总分: " + String.format("%.2f",(this.pc + this.math + this.eng)));
    }

    public void avg() {
        System.out.println("平均分: " + String.format("%.2f",(this.pc + this.math + this.eng) / 3));
    }
    public void max() {
        System.out.println("最高分:"
                + (this.pc > this.math ? (this.pc > this.eng ? this.pc
                : this.eng) : (this.math > this.eng ? this.math
                : this.eng)));
    }

    public void min() {
        System.out.println("最低分:"
                + (this.pc < this.math ? (this.pc < this.eng ? this.pc
                : this.eng) : (this.math < this.eng ? this.math
                : this.eng)));
    }
    public void display(){
        System.out.println("学生姓名: " + this.name + ". 计算机成绩: " +
                this.pc + ". 数学成绩: " + this.math + ". 英语成绩: " + this.eng);
    }
    public static void main(String[] args) {
        Student stu = new Student("张三", 59.3, 89.1, 90);
        stu.max();
        stu.min();
        stu.sum();
        stu.avg();
        stu.display();
    }
}
