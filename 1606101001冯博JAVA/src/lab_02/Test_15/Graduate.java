package lab_02.Test_15;

public class Graduate implements StudentInterface,TeacherInterface{
    private String name;
    private String sex;
    private int age;
    private int fee;
    private int pay;
    public Graduate(String name,int fee,int pay){
        super();
        this.name = name;
        this.fee = fee;
        this.pay = pay;
        if (this.fee-this.pay < 2000){
            System.out.println("You need a loan!");
        }
        else{
            System.out.println("You income is enough!");
        }
    }
    @Override
    public void setFee(int fee) {
        this.fee = fee;
    }
    @Override
    public int getFee() {
        return this.fee;
    }
    @Override
    public void setPay(int pay) {
        this.pay = pay;
    }
    @Override
    public int getPay() {
        return this.pay;
    }
    public static void main(String[] args) {
        new Graduate("张三",10000,9000);
    }
}
