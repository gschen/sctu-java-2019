package lab02.Test_04;

public class Staff {
    //属性  姓名，号码，薪水，薪水增长额
    String name;
    int number;
    int saly;
    float other;

    //方法
       String  Staff(String myname){
           return name = myname;
       }
       public void setNumber( int mynumber){
           number = mynumber;
       }

       public void setSaly( int mysaly){

           saly = mysaly;
       }
       public void  setOther(float myother){
           other = myother;

       }
       public void printstaff(int i){
           System.out.println("名字"+name);
           System.out.println("号码" +number);
           System.out.println("薪水"+ saly);

       }


    //获取员工姓名  号码   基本薪水
    //计算薪水增长额    以及之后的工资
    public static void main(String[] args) {
        Staff all = new Staff();
        all.setNumber(123);
        all.setOther(123);
        all.setSaly(20000);

    }

}

