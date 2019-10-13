package lab_02;

public class Test_04 {
    String name;
    String number;
    int salary;
    int Salary_increase;

    void printof(){
        System.out.println("姓名："+name);
        System.out.println("员工号码："+number);
        System.out.println("基本薪水："+salary);
        System.out.println("薪水增长额："+Salary_increase);
        System.out.println("工资总额："+(salary+Salary_increase));
    }

    public static void main(String[] args) {
        Test_04 staff = new Test_04();
        staff.name = "张三";
        staff.number = "12345678";
        staff.salary = 4500 ;
        staff.Salary_increase = 1200 ;

        staff.printof();
    }
}
