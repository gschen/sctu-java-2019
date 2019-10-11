package Lab02.Test04;

public class Employee {
    private String num;
        private String name;
        private float salary;
        private String department;

        public Employee() {               //无参构造函数
        }
        public Employee(String num){       //单参构造函数
            this.num=num;
            this.name="无名氏";
            this.department="未定";
            this.salary=0;
        }
        public Employee(String num,String name){           //双参构造函数
            this.num=num;
            this.name=name;
            this.department="后勤";
            this.salary=1000;
        }
        public Employee(String num,String name,String department,float salary){         //4参构造函数
            this.num=num;
            this.name=name;
            this.department=department;
            this.salary=salary;
        }
        public void print(){
            System.out.println("员工编号为"+num);
            System.out.println("员工姓名："+name);
            System.out.println("部门："+department);
            System.out.println("薪水："+salary);
            System.out.println();
        }
    }

    /*public class fiveDemo07{
        public static void main(String args[]){
            Employee emp1=new Employee();
            emp1.print();
            Employee emp2=new Employee("010101");
            emp2.print();
            Employee emp3=new Employee("020202","张三");
            emp3.print();
            Employee emp4=new Employee("030303","李四","人资",3000);
            emp4.print();
        }*/

