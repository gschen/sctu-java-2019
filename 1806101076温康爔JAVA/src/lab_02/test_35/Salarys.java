package lab_02.test_35;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Salarys {
    public static <Saleman> void main(String args[]){
        double basis;
        int days;
        double commission;
        System.out.print("请输入基本工资：");
        Scanner reader=new Scanner(System.in);
        basis=reader.nextDouble();
        System.out.print("请输入工作天数：");
        days=reader.nextInt();
        System.out.print("请输入销售提成：");
        commission=reader.nextDouble();
        Manager a=new Manager(basis);
        a.Salary();
        System.out.println("Manager的工资为："+basis);
        Salesman b=new Salesman(basis,commission);
        b.Salary();
        System.out.println("Salasman的工资为："+(basis+commission));
        Worker c=new Worker(days,basis);
        c.Salary();
        System.out.println("Worker的工资为："+(basis*days));
    }
}
