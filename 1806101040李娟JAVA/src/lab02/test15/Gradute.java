package lab02.test15;

//2)	定义一个研究生类Graduate，实现StudentInterface接口和TeacherInterface接口，它定义的成员变量有name（姓名），sex（性别），
// age（年龄），fee（每学期学费） pay（月工资）。
//3)	创建一个姓名为“zhangsan”的研究生，统计他的年收入和学费，如果收入减去学费不足2000元，则输出“You  need a loan!”（
// 需要贷款）的信息，否则输出“You income is enough！”信息。
// 要求在Graduate中实现各个接口声明的抽象方法。
import java.util.Scanner;

public class Gradute implements StudentInterface,TeacherInterface {
    String name;
    String ssex;
    int age;
    double fee;
    double pay;

    @Override
    public void setFee(double fee) {
        this.fee=fee;
    }

    @Override
    public void getFee(double fee) {
        this.fee=fee;
        System.out.println("你的学费为："+this.fee);
    }


    @Override
    public void setPay(double pay) {
        this.pay= pay * 12;
    }

    @Override
    public void getPay(double pay) {
        this.pay=pay;
        System.out.println("你的年工资："+this.pay);
    }


    //是否需要贷款
    public boolean Loan() {
        if ((this.pay - this.fee) < 2000) {
            System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
            return true;
        }
        System.out.println("你的年收入" + this.pay + ",减去学费" + this.fee + "等于" + (this.pay - this.fee));
        return false;
    }


    public static void main(String[] args) {
        Gradute g1= new Gradute();

        g1.name = "zhangsan";
        g1.ssex = "男";
        g1.age=19;

        System.out.println(g1.name);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你的学费：");
//        double fee=sc.nextDouble();
        g1.setFee(1000);

//        System.out.println("请输入你的月收入：");
//        double pay=sc.nextDouble();
        g1.setPay(2000);




        // 判断是否需要贷款
        boolean flag =g1.Loan();
        if (flag) {
            System.out.println("provide a loan(需要贷款)");
        }else {
            System.out.println("自给自足，丰衣足食");
        }

        //if((g1.getPay()*12-g1.getFee())<=2000)
        //    System.out.println("Provide a loan!");
        //else
        //    System.out.println("He is OK!");





    }
}


