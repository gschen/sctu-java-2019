package lab02.Test_03;

public class Student {

    //变量：姓名，年龄，计算机成绩，数学成绩，英语成绩
    String name;
    int age;
    int computer;
    int math;
    int English;

    double sum(){return this.computer + this.math + this.English;}
    double average(){
        return (this.computer + this.math + this.English)/3;
    }

    double max() {
        double max = computer > math ? math : computer;
        max = max > English ? max : English;
        return max;
    }

    double min() {
        int min = 0;
        if (this.math < this.computer && this.computer < this.English) {
            min = this.math;
        }
        if(this.math< this.English && this.English < this.computer){
            min=this.math;
        }

        if(this.computer< this.English && this.English < this.math){
            min=this.computer;
        }

        if(this.computer< this.math && this.math < this.English){
            min=this.computer;
        }

        if(this.English< this.computer && this.computer< this.math){
            min=this.English;
        }

        if(this.English< this.math && this.math< this.computer){
            min=this.English;
        }

        return min;
    }


    public static void main(String[] args) {
        Student s1=new Student();

        s1.name="haha";
        s1.age=19;
        s1.computer=81;
        s1.math=69;
        s1.English=61;

        s1.sum();
        s1.average();
        s1.max();
        s1.min();

        System.out.println("姓名:"+s1.name);
        System.out.println("年龄："+s1.age);
        System.out.println("计算机成绩:"+s1.computer);
        System.out.println("数学成绩:"+s1.math);
        System.out.println("英语成绩:"+s1.English);
        System.out.println("总成绩："+s1.sum());
        System.out.println("平均成绩："+s1.average());
        System.out.println("最高分："+s1.max());
        System.out.println("最低分："+s1.min());
    }
}




