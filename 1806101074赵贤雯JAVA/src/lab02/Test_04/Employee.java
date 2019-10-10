package lab02.Test_04;

/*4、 	编写并测试一个代表员工的类。它的属性包括：员工姓名、员工号码、员工基本薪水、员工薪水增长额；它的方法包括：构造方法、获取员工姓名、获取员工号码、获取员工基本薪水、计算薪水增长额及计算增长后的工资总额。*/
public class Employee {
    // 1. 属性
    // 员工姓名、编号、基本薪水、薪水增长额
    private String name;
    private String number;
    private int salary;
    private int increase;

    Employee(String name , String number , int salary , int increase){
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.increase = increase;

    }

    // 2. 行为
    // 构造方法、获取员工姓名、获取员工号码、获取员工基本薪水、计算薪水增长额、级计算增长后的工资总额
     public String getNumber(){
        return number;
    }
    public void setNumber(){
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIncrease() {
        return increase;
    }

    public void setIncrease(int increase) {
        this.increase = increase;
    }
    public int sum(){//计算工资总额
        return salary + increase;
    }

    public void print(){
        System.out.println("员工姓名：" + this.name + "  员工编号：" + this.number + "  员工基本薪水：" + this.salary + "  员工薪水增长额：" + this.increase);
    }//输出

    public static void main(String[] args) {
        Employee people = new Employee("张三","1806101564",3000,500);
        people.print();

        System.out.println("员工姓名：" + people.getName());
        System.out.println("员工编号：" + people.getNumber());
        System.out.println("员工基本薪水" + people.getSalary());
        System.out.println("员工薪水增长额：" + people.getIncrease());
        System.out.println("增长后工资总额为：" + people.sum());
    }

 }
