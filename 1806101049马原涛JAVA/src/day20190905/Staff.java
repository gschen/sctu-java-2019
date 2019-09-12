package day20190905;

public class Staff {
    String name,idcode;
    double baseSalary,rise,salary;

    void setIf(String name,String idcode,double baseSalary,double rise)
                {
                    this.baseSalary=baseSalary;
                    this.idcode=idcode;
                    this.name=name;
                    this.rise=rise;
                }

    String getName(){System.out.println("姓名："+name);return name;};
    String getIdcode(){System.out.println("员工号码："+idcode);return idcode;};
    double getRise(){System.out.println("工资增长额："+rise);return rise;};
    double getBaseSalary(){System.out.println("底薪："+baseSalary);return baseSalary;};
    double getSalary(){salary=rise+baseSalary;System.out.println("工资总额：");return salary;};

    void getEvery(){System.out.println(name+"   "+idcode+"   "+"底薪："+baseSalary+"   工资增长额："+rise+"   总薪水："+(rise+baseSalary));}

    public static void main(String[] args) {
        Staff one=new Staff();
        one.setIf("马原涛","1806101049",8000,1500);
        one.getEvery();
    }
}
