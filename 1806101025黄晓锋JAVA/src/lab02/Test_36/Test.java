package lab02.Test_36;

public class Test {

    public static void main(String[] args) {

        System.out.println("姓名"+" "+" 类型 "+" "+"成绩");

        Undergraduate undergraduate = new Undergraduate("张三","本科生",90,95,100);
        Undergraduate undergraduate1 = new Undergraduate("李四","本科生",80,85,90);
        Postgraduate postgraduate = new Postgraduate("王五","研究生",82,85,88);
        Undergraduate undergraduate2 = new Undergraduate("赵六","本科生",75,82,87);
        Postgraduate postgraduate1 = new Postgraduate("陈七","研究生",80,82,84);

        undergraduate.average();
        undergraduate1.average();
        postgraduate.average();
        undergraduate2.average();
        postgraduate1.average();
    }
}
