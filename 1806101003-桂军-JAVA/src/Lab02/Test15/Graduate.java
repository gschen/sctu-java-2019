package Lab02.Test15;

public class Graduate implements StudentInterface,TeacherInterface{
    String name;
    String sex;
    int age;
    double fee;
    double pay;

    Graduate(String name,String sex,int age,double fee,double pay){
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.fee = fee;
    this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void setFee(double fee) {
    this.fee = fee;
    }

    @Override
    public double getFee() {
        return fee;
    }

    @Override
    public void setPay() {
        this.pay = pay;
    }

    @Override
    public double getPay() {//double 报错把接口内的方法改为抽象
        return pay;
    }


}

