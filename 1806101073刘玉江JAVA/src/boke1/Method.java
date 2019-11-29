package src.boke1;

import java.util.Scanner;

public class Method {
    Scanner input = new Scanner(System.in);
    public void main(){
        System.out.println("请输入     1增加员工     2删除员工     3修改员工     4查询员工     5显示全部员工     6退出程序");
        System.out.println("请选择：");
        choice();
    }
    //增加员工
    public void addEmployee(){

        Employee e = new Employee();
        System.out.println("添加员工：");
        System.out.println("输入id,该Id值应为0~9999之间:");
        int idnumber = input.nextInt();
        e.setId(idnumber);
        if(0<idnumber&&idnumber>9999){
            System.out.println("请输入0~9999之间的数，请重新输入");
        }else{

//判断输入的id是否已经存在
            if(Employee.employees[e.getId()]!=null){
                System.out.println("已有id,请重新输入!若要修改该id的员工信息，请输入3进入修改。");
            }else{
                System.out.println("输入姓名:");
                e.setName(input.next());
                System.out.println("输入性别:");
                e.setSex(input.next());
                System.out.println("输入工资:");
                e.getSalary(input.next());
                Employee.employees[e.getId()] = e;
                System.out.println("添加成功");

            }
        }


    }
    //删除员工的方法
    public void deleteEmployee(){
        System.out.println("请输入要删除员工的id：");
        int id = input.nextInt();
//判断输入id是否存在
        seachID(id);
        if(Employee.employees[id]!=null){
            Employee.employees[id]=null;
            System.out.println("删除成功！");
        }
    }
    //修改
    public void changeEmployee(){
//显示全部
// showEmployee();
        System.out.println("输入需要修改的员工的id：");
        int id = input.nextInt();
//判断输入id是否存在
        seachID(id);
//如果存在就继续
        if(Employee.employees[id]!=null){
            System.out.println("请输入你要修改的选项1)id 2)姓名 3)性别 4)工资");
            int change = input.nextInt();

            switch(change){
                case 1:
                    System.out.println("修改为id：");
                    int in = input.nextInt();
                    for(int i=0;i < Employee.employees.length; i++){
                        if(Employee.employees[in]!=null){
                            System.out.println("该id已存在，请重新赋值！");
                            System.out.println("修改失败！");
                            break;
                        }else{
                            Employee.employees[id].setId(in);
                            System.out.println("修改成功");
                            break;
                        }
                    }


                    break;
                case 2:
                    System.out.println("修改为姓名：");
                    String j = input.next();
                    Employee.employees[id].setName(j);
                    System.out.println("修改成功");

                    break;
                case 3:
                    System.out.println("修改为性别：");
                    String k = input.next();
                    Employee.employees[id].setSex(k);
                    System.out.println("修改成功");

                    break;
                case 4:
                    System.out.println("修改为工资：");
                    String l = input.next();
                    Employee.employees[id].setSalary(l);
                    System.out.println("修改成功");

                    break;
                default:
                    System.out.println("请输入1-4的数！！！");
            }


        }

    }
    //查询
    public void seachEmployee(){
        System.out.println("输入需要查询的员工的id：");
        int id = input.nextInt();
        seachID(id);

    }

    //显示全部
    public void showEmployee(){
        System.out.println("id\t姓名\t性别\t工资");
        for(int i=0;i < Employee.employees.length; i++){
            if(Employee.employees[i]!=null){
                Employee.employees[i].show();
            }
        }
    }

    //判断id是否存在的方法
    public void seachID(int b){
        for(int i=0;i < Employee.employees.length; i++){
            if(Employee.employees[b]!=null){
                System.out.println("id\t姓名\t性别\t工资");
                Employee.employees[b].show();
                break;
            }else{
                System.out.println("未找到id为"+b+"的员工信息！");
                System.out.println("操作失败！");
                break;
            }
        }
    }

    public void choice(){
        int i = input.nextInt();
        switch(i){
            case 1:
//增加员工
                addEmployee();
                main();
                break;
            case 2:
//删除员工
                deleteEmployee();
                main();
                break;
            case 3:
//修改员工
                changeEmployee();
                main();
                break;

            case 4:
//查询员工
                seachEmployee();
                main();
                break;

            case 5:
//显示全部
                showEmployee();
                main();
                break;
            case 6:
//退出程序
                System.out.println("************************退出成功************************");
                break;
            default:
                System.out.println("输入有误，请重新输入！");
                main();

        }
    }

}
