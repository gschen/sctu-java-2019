package lab_02;

public class Student1 {
    //1.属性
    //计算机成绩，数学成绩，英语成绩
    double computer;
    double math;
    double english;
    String name;
    int age;
    double total()
    {
        return this.computer+this.english+this.math;
    }
    double average(){
        return (this.math+this.computer+this.english)/3;
    }
    double max(){
        double max=computer>math?computer:math;
        max=max>english?max:english;
        return max;
    }
    double min(){
        double min=computer<math?computer:math;
        min=min<english?min:english;
        return min;
    }

    public static void main(String[] args) {
        Student1 c1=new Student1();
        c1.math=90;
        c1.english=85;
        c1.computer=88;
        c1.age=18;
        c1.name="XXX";
        c1.average();
        c1.max();
        c1.min();
        c1.total();
        System.out.println("学生"+c1.name+" "+c1.age+"\n"+"计算机成绩："+
                c1.computer+"\n"+"英语成绩："+c1.english+"\n"+"数学成绩："+c1.math
        +"\n"+"总分："+c1.total()+"\n"+"平均分："+c1.average()+"\n"+
                "最低分："+c1.min()+" "+"最高分："+c1.max());
    }
}
