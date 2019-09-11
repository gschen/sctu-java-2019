package lab02;
import java.util.Scanner;
public class Business {
    String name;
    String number;
    String money;
    String ratio;

    public String getName() {
        return name;
    }

    public String getMoney() {
        return money;
    }
    public String getNumber(){
        return number;
    }
    public String getRatio(){
        return ratio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
}
 public void printInfo(){
     System.out.println("员工姓名："+name+"\n"+"员工号码："+number+"\n"+"员工工资"+money+"\n"+"员工工资增长率："+ratio);
 }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       Business b=new Business();
        System.out.println("请输入姓名");
        b.setName(input.next());
        System.out.println("请输入员工号码：");
         b.setNumber(input.next());
        System.out.println("请输入你的工资：");
        b.setMoney(input.next());
        System.out.println("请输入你的工资增长额：");
        b.setRatio(input.next());
        b.printInfo();

    }
}


