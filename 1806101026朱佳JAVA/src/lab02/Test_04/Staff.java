package lab02.Test_04;

public class Staff {
    //属性
    String name;
    String number;
    double basicsalary;
    double addsalary;

    //方法
    void printInfo(){
        System.out.println("姓名："+this.name);
        System.out.println("电话号码："+this.number);
        System.out.println("基本薪水："+this.basicsalary);
        System.out.println("增加的工资："+this.addsalary);
    }

    double sum(){
        return this.basicsalary + this.addsalary;
    }

    public static void main(String[] args) {
        Staff s1=new Staff();

        s1.name="haha";
        s1.number="17734981052";
        s1.basicsalary=6000;
        s1.addsalary=800;

        s1.printInfo();
        s1.sum();

        System.out.println("总工资："+s1.sum());
    }
}


