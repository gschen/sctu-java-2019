package lab_02.Test_04;
//4、 	编写并测试一个代表员工的类。它的属性包括：员工姓名、员工号码、员工基本薪水、员工薪水增长额；它的方法包括：构造方法、获取员工姓名、
//        获取员工号码、获取员工基本薪水、计算薪水增长额及计算增长后的工资总额。
public class Work {
    private String name;
    private String code;
    private int money;
    private int increaseM;

    public Work(String name,String code,int money,int increaseM){
        this.name = name;
        this.code = code;
        this.money = money;
        this.increaseM = increaseM;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getMoney() {
        return money;
    }

    public int increaseM(){
        int m =(this.money += increaseM);
        return m;
    }
}
