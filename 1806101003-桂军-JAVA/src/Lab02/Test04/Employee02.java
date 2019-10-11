package Lab02.Test04;

public class Employee02 {
       String number;
       String name;
        float salary;
        float time;


        //员工信息
        public void imformation(){
            System.out.println("员工号码为："+number);
            System.out.println("员工姓名为："+name);
        }

        //  工资的增长方式
        public void inctell(){
            System.out.println("增长额="+"工作年限*"+200);
            System.out.println("增长额为"+time*200);
        }
        //工资的计算方式
        public void total(){
            System.out.println("工资总数=基本工资+增长额");
            System.out.println("您的总共资为"+salary+time*200);
        }
    }

