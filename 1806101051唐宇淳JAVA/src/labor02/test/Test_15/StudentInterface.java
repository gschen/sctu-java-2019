package labor02.test.Test_15;

interface StudentInterface {
    void setFee();
    void getFee();
}
interface TeacherInterface{
    void setFee();
    void  getFee();
}
class Graduate implements StudentInterface,TeacherInterface{
    public String name;
    public String sex;
    public  int age;
    public  float fee;
    public  float pay;
    @Override
    public void setFee() {
        System.out.println("学费是："+this.fee);
    }
    @Override
    public void getFee() {
        System.out.println("工资是："+this.pay);
    }
    void count(){
        if (this.fee>this.pay){
            System.out.println("You  need a loan!");
        }
        else if (this.fee<this.pay){
            System.out.println("You income is enough！");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Graduate gr = new Graduate();
        gr.name = "张三";
        gr.age = 19;
        gr.sex = "男";gr.pay = 10000;gr.fee = 5000;
        gr.getFee();gr.setFee();gr.count();

    }
}
