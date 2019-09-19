package lab_02.text_04;

public class Staff {
    private String name;
    private String number;
    private int money;
    private int growth;


    private Staff(String name,String number,int money,int growth){
        this.name=name;
        this.number=number;
        this.money=money;
        this.growth=growth;
    }

    private void print(){
        System.out.println("姓名："+name);
        System.out.println("编号："+number);
        System.out.println("基本工资;"+money);
        System.out.println("工资增长额："+growth);
        System.out.println("总工资："+(money+growth));
    }

    public static void main(String[] args) {
        Staff staff=new Staff("张三","0001",2000,100);

        staff.print();
    }
}
