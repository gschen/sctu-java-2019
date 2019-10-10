package lab_02.text_03;

public class Grade {
    //变量
    private int computer;
    private int math;
    private int English;


    //成员方法
    private int ALL(){
        //计算总成绩
        return this.computer+this.math+this.English;
    }

    private int average(){
        //计算平均成绩
        return (this.computer+this.math+this.English)/3;
    }

    private int heap(){
        //计算最高分
        int n=this.computer;
        if (n<this.math){
            n=this.math;
        }
        else if (n>this.math){
            if (n<this.English){
                n=this.English;
            }
            else{
                n=this.computer;
            }
        }
        return n;
    }

    private int low(){
        //计算最低分
        int m=this.computer;
        if (m>this.math){
            m=this.math;
        }
        else if (m<this.math){
            if (m>this.English){
                m=this.English;
            }
            else{
                m=this.computer;
            }
        }
        return m;
    }
    private void printInfo(){
        //打印信息表
        System.out.println("总分是："+this.ALL());
        System.out.println("平均分是："+this.average());
        System.out.println("最高分是："+this.heap());
        System.out.println("最低分是："+this.low());
    }

    public static void main(String[] args) {
        Grade student1=new Grade();
        student1.computer=85;
        student1.math=90;
        student1.English=89;

        student1.printInfo();
        int all= student1.ALL();
        int aver=student1.average();
        int heap=student1.heap();
        int low =student1.low();

    }

}
