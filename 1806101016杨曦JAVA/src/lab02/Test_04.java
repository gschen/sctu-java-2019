package lab02;

//4、 	编写并测试一个代表员工的类。它的属性包括：员工姓名、员工号码、员工基本薪水、员工薪水增长额；
// 它的方法包括：构造方法、获取员工姓名、获取员工号码、获取员工基本薪水、计算薪水增长额及计算增长后的工资总额。

public class Test_04 {

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
        Test_04 s1=new Test_04();

        s1.name="陆星辰";
        s1.number="18712347865";
        s1.basicsalary=6000;
        s1.addsalary=1000;

        s1.printInfo();
        s1.sum();

        System.out.println("总工资："+s1.sum());
    }
}
