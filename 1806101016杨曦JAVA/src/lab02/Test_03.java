package lab02;

//3、 	设计一个表示学生的类，里面有学生的三项成绩：计算机成绩、数学成绩、英语成绩。
// 要求可以求总分、平均分、最高分、最低分，并且可以输出一个学生的完整信息。
public class Test_03 {

    String name;
    int computer;
    int math;
    int English;

    double add(){
        return this.computer + this.math + this.English;
    }

    double average(){
        return (this.computer + this.math + this.English)/3;
    }

    double max() {
        double max = computer > math ? math : computer;
        max = max > English ? max : English;
        return max;
    }

    double min(){
        int min=0;
        if(this.math< this.computer && this.computer< this.English){
            min=this.math;
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
        Test_03 s1=new Test_03();

        s1.name="小明";
        s1.computer=70;
        s1.math=69;
        s1.English=31;

        s1.add();
        s1.average();
        s1.max();
        s1.min();

        System.out.println("姓名:"+s1.name);
        System.out.println("计算机成绩:"+s1.computer);
        System.out.println("数学成绩:"+s1.math);
        System.out.println("英语成绩:"+s1.English);
        System.out.println("总成绩："+s1.add());
        System.out.println("平均成绩："+s1.average());
        System.out.println("最高分："+s1.max());
        System.out.println("最低分："+s1.min());
    }
}
