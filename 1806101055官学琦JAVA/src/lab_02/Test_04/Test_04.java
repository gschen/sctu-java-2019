package lab_02.Test_04;

public class Test_04 {
    public static void main(String[] args) {
        Employee employee=new Employee("官学琦","1806101055",500,100);
        employee.print();
    }
}
class Employee{
    private String name;
    private String num;
    private int salary;//薪水
    private int increase;//薪水增长额
    public Employee(String name,String num,int salary,int increase){
        this.increase=increase;
        this.name=name;
        this.num=num;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public int getIncrease() {
        return increase;
    }

    public int getSalary() {
        return salary;
    }

    public String getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncrease(int increase) {
        this.increase = increase;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int sum(){
        return salary+increase;
    }
    public void print(){
        System.out.println("员工姓名:"+this.name+"\n员工编号:"+this.num+"\n基本工资:"+this.salary+"\n总工资:"+this.sum());
    }

}





