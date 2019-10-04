package lab_02.test_15;

public class Graduate implements StudentInterface,TeacherInterface {//接口的实现
    private String name,sex;
    private int age;
    private double fee,pay;
    Graduate(){
    }
    Graduate(String name,String sex,int age,double fee,double pay){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.fee=fee;
            this.pay=pay;
    }
    public String getName() {
        return name;
    }
    public String getSex(){
        return sex;
    }
    public int getAge(){
        return age;
    }
    public void setFree(double fee){
        this.fee=fee;
    }
    public double getFree(){
        return fee;
    }
    public void setPay(double pay){
        this.pay=pay;
    }
    public double getPay(){//对接口的抽象方法必须重写
        return pay;
    }
}
