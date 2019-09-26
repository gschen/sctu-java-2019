package lab_02.test_04;


//1.属性
public class Staff {
    public String number;
    public String name;
    public float salary;
    public  float time;


    //2.行为
    //赋值

    public void inctell(){
        System.out.println("增长额="+"工作年限*"+200);
        System.out.println("增长额为"+time*200);
    }
    public void total(){
        System.out.println("工资总数=基本工资+增长额");
        System.out.println(salary+time*200);


    }

   /* public Staff(String name,String munber,double money){
        this.name=name;
        this.munber=munber;

    }
    //员工1

    public static void main(String[] args) {
        Staff s1 = new Staff("张三", "10086", 5000);


    }   */


}
