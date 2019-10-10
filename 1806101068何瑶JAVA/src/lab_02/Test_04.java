package lab_02;

public class Test_04 {
    private int number;
    private String ename;
    private double sal;      //基本薪水
    private double rate;     //薪水增长额
    public Test_04(){}
    public Test_04(int number,String ename,double sal,double rate){
        super();
        this.number=number;
        this.ename=ename;
        this.sal=sal;
        this.rate=rate;
    }
    public String toString(){
        return "雇员编号："+this.number+"\t雇员姓名："+this.ename+"\t基本工资："+this.sal;
    }
    public void growthin(){
        this.sal=this.sal+this.rate;
    }
    public void setEmpno(int number){
        this.number=number;
    }
    public int getNumber(){
        return this.number;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public String getEname(){
        return this.ename;
    }
    public void setSal(double sal){
        this.sal=sal;
    }
    public double getSal(){
        return this.sal;
    }
    public void setRate(double rate){
        this.rate=rate;
    }
    public double getRate(){
        return this.rate;
    }
    public static void main(String[] args) {
        Test_04 emp=new Test_04(1234,"xx",3000,1.5);
        emp.growthin();                                     //工资增长
        System.out.println(emp);
    }
}
