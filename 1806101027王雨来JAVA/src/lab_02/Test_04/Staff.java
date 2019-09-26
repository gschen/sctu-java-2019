package lab_02.Test_04;
/*4、 	编写并测试一个代表员工的类。它的属性包括：员工姓名、员工号码、员工基本薪水、员工薪水增长额；
        它的方法包括：构造方法、获取员工姓名、获取员工号码、获取员工基本薪水、
        计算薪水增长额及计算增长后的工资总额。*/
public class Staff {
    String name;
    int number;
    double baseSalary;
    double salaryIncrease;
    double sum;
    public Staff(String name,int number,double baseSalary,double salaryIncrease){
        this.name = name;
        this.number = number;
        this.baseSalary = baseSalary;
        this.salaryIncrease = salaryIncrease;
        this.sum = baseSalary + salaryIncrease;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", baseSalary=" + baseSalary +
                ", salaryIncrease=" + salaryIncrease +
                ", sum=" + sum +
                '}';
    }
}
