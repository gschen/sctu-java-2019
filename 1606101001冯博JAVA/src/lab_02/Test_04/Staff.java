package lab_02.Test_04;

public class Staff {
    String name;
    int number;
    double oldSalary;
    double newSalary;
    double increase;
    void printInfo(){
        System.out.println("员工信息为：");
        System.out.println("姓名：" + this.name);
        System.out.println("员工号：" + this.number);
        System.out.println("员工薪水：" + this.newSalary + "元");
        System.out.println("员工薪水增长额：" + this.increase);
    }
    public static void main(String[] args) {
     Staff fb = new Staff();
     fb.name = "冯博";
     fb.number = 01;
     fb.oldSalary = 99999.5;
     fb.newSalary = 100000.2;
     fb.increase = (fb.newSalary-fb.oldSalary)/fb.oldSalary;
     fb.printInfo();
    }
}
