package day20190905.test_4;

public class Staff {
     String name;
     String num;
     String  salary ;
     String growth;


     void printInfo(){
         System.out.println("姓名："+this.name);
         System.out.println("员工号码："+this.num);
         System.out.println("工资："+this.salary);
         System.out.println("工资增长额："+this.growth);
    }
    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public void setMoney(String money) {
        this.salary = salary;
    }

    public String getGrowth() {
        return growth;
    }
}



