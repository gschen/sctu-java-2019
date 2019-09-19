package lab_02.test_04;

//4、 	编写并测试一个代表员工的类。它的属性包括：员工姓名、员工号码、员工基本薪水、员工薪水增长额；
// 它的方法包括： 构造方法、获取员工姓名、获取员工号码、获取员工基本薪水、计算薪水增长额及计算增长后的工资总额。

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Employee {
    //1.属性
    //员工姓名、员工号码、员工基本薪水、员工薪水增长额
    private String name;
    private int number;
    private int salary;
    private int increase;

    //2.构造方法
    public Employee(String name, int number, int salary, int increase) {
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.increase = increase;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String toString() {
        return "雇员姓名：" + this.name + "\t雇员编号：" + this.number + "\t基本薪水：" + this.salary;
    }

    public void growthin() {
        this.salary = this.salary + this.increase;
    }
}

